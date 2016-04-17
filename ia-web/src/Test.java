import org.seasar.doma.jdbc.tx.LocalTransaction;


import ia.dao.TCustomerDaoImpl;
import ia.entity.TCustomer;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalTransaction tx = null;
		//tx = AppConfig.getLocalTransaction();
        try {
            // トランザクションの開始
//            tx.begin();
//
//            // aptで生成されたDaoの実装クラスを生成
//            TCustomerDao dao = new TCustomerDaoImpl();
//
//            // 主キーでエンティティを検索
//            TCustomer employee = dao.selectById("a");
//
            // エンティティのプロパティを変更
           
            // トランザクションのコミット
            tx.commit();
        } finally {
            // トランザクションのロールバック
            tx.rollback();
        }


	}

}
