package ia.action;

import ia.annotation.Action;
import ia.core.IaConstant;
import ia.entity.TPo;
import ia.entity.TPoDetail;
import ia.entity.TShip;
import ia.entity.custom.TShipCus;
import ia.model.ShipModel;
import ia.model.TraceModel;
import ia.service.MasterService;
import ia.service.ShipService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringBufferInputStream;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang.StringUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

@Action
public class TraceAction {

	@Inject
	ShipService service;

	@Inject
	TraceModel model;

	@Inject
	MasterService masterService;

	private String URL = "https://trackings.post.japanpost.jp/services/srv/search/?requestNo1=CDxxxxxxxxxJP&search.x=83&search.y=18&search=追跡スタート&startingUrlPatten=&locale=ja";

	/**
	 * 查询
	 */
	public void getAllShip() {

		TShip conship = new TShip();

		conship.setCustId(model.getConCustomerId());
		conship.setShipState(model.getConShipState());

		List<TShipCus> shipList = service.getAllShip(conship);

		List<TShipCus> shipListTmp = new ArrayList<TShipCus>();
		List<TShipCus> shipListTmp2 = new ArrayList<TShipCus>();

		if (model.getShipDateFrom() != null) {
			for (TShipCus obj : shipList) {
				if (obj.getShipDate().compareTo(model.getShipDateFrom()) >= 0) {
					shipListTmp.add(obj);
				}
			}
		} else {
			shipListTmp.addAll(shipList);
		}

		if (model.getShipDateTo() != null) {
			for (TShipCus obj : shipListTmp) {
				if (obj.getShipDate().compareTo(model.getShipDateTo()) <= 0) {
					shipListTmp2.add(obj);
				}
			}
		} else {
			shipListTmp2.addAll(shipListTmp);
		}

		model.setShipList(shipListTmp2);

	}

	/**
	 * 更新运单
	 * 
	 * @param poDetail
	 */
	public void updateShip(TShip ship) {

		if (service.updateShip(ship) == null) {
			FacesContext.getCurrentInstance().addMessage(
					"form",
					new FacesMessage(FacesMessage.SEVERITY_ERROR,
							"该数据已被其他用户更改，请刷新后重试。", null));
			return;
		}
		this.getAllShip();

		masterService.loadShip();

	}

	public void trace() throws IOException {
		for (TShipCus ship : model.getShipList()) {
			if(StringUtils.equals(ship.getShipState(), IaConstant.SHIP_STATE_SENT)
					&& !StringUtils.isEmpty(ship.getLableNo())){
				java.net.URL url = new java.net.URL(URL.replace("CDxxxxxxxxxJP", ship.getLableNo()));
				Document doc = Jsoup.parse(this.getContent(url));
				Elements tables = doc.getElementsByTag("table");
				for (Element table : tables) {

					if (StringUtils.equals("履歴情報", table.attr("summary"))) {
						Elements trs = table.getElementsByTag("tr");
						Element tr = trs.get(trs.size() - 2);
						Elements tds = tr.getElementsByTag("td");
						if(tds.size() >= 5){
							//tds.get(0);//时间
							//tds.get(1);//状态
							//tds.get(3);//地点
							//tds.get(4);//国
							
							ship.setLableState(tds.get(1).text());
							ship.setShipAddr(tds.get(0).text()+"---"+tds.get(3).text()+"---"+tds.get(4).text());
							service.updateShip(ship);
						}
					}
				}
			}
		}
		
		this.getAllShip();
	}

	/**
	 * 获得url页面的内容
	 * 
	 * @param url
	 * @return
	 */
	private String getContent(java.net.URL url) {
		StringBuffer builder = new StringBuffer();

		int responseCode = -1;
		HttpURLConnection con = null;
		try {
			con = (HttpURLConnection) url.openConnection();
			con.setConnectTimeout(60000);
			con.setReadTimeout(60000);
			
			con.setRequestProperty("Accept-Charset", "UTF-8");
			con.setRequestProperty("Charset", "UTF-8");
			con.setRequestProperty("Content-type", "text/html");


			// 获得网页返回信息码
			responseCode = con.getResponseCode();

			if (responseCode == -1) {
				return null;
			}

			if (responseCode >= 400) {
				return null;
			}

	
			
			InputStream is = con.getInputStream();
			InputStreamReader isr = new InputStreamReader(is,"utf-8");
			BufferedReader br = new BufferedReader(isr);

			String str = null;
			while ((str = br.readLine()) != null)
				builder.append(str);
			is.close();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			con.disconnect();
		}
		return builder.toString();
	}

}
