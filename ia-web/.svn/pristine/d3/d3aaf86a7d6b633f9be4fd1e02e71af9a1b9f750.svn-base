package ia.service;

import ia.annotation.Service;
import ia.dao.TAddrDao;
import ia.entity.TAddr;
import ia.entity.TCustomer;

import java.util.List;

import javax.inject.Inject;

@Service
public class AddrService {

	@Inject
	TAddrDao dao;
	

	/**
	 * 新建地址
	 * 
	 * @param po
	 * @return
	 */
	public TAddr createAddr(TAddr addr) {
		dao.insert(addr);
		return dao.selectById(addr.getAddrId());
	}

	/**
	 * 更新地址
	 * @param addr
	 * @return
	 */
	public TAddr updateAddr(TAddr addr) {
		try{
			dao.update(addr);
		}catch(Exception e){
			return null;
		}
		return dao.selectById(addr.getAddrId());
	}
	
	/**
	 * 地址查询
	 * @return
	 */
	public List<TAddr> selectAllAddr(){
		return dao.selectAll("");
	}
	
	/**
	 * 地址查询
	 * @return
	 */
	public List<TAddr> selectAddr(TAddr addr){
		return dao.selectByExample(addr, "ORDER BY ADDR_ID");
	}
	
	/**
	 * 删除地址
	 * @param addr
	 * @return
	 */
	public void deleteAddr(TAddr addr){
			dao.delete(addr);
		
	}

}
