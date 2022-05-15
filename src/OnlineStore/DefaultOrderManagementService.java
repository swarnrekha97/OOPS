package OnlineStore;

import java.util.Arrays;

public class DefaultOrderManagementService implements OrderManagementService {

	private static final int DEFAULT_ORDER_CAPACITY = 10;

	private static DefaultOrderManagementService instance;

	Order[] orders;
	// <write your code here>
	
	public static OrderManagementService getInstance() {
		if (instance == null) {
			instance = new DefaultOrderManagementService();
		}
		return instance;
	}

	@Override
	public void addOrder(Order order) {
		// <write your code here>
		if(orders==null) {
			orders=new Order[1];
			orders[0]=order;
			
			}
		else
		{
			int length=orders.length;
			Order[] newarray=new Order[length+1];
			newarray=Arrays.copyOf(orders, length+1);
			newarray[length]=order;
			orders=newarray;
		}
		System.out.println("Order placed successfully!");
		
	}

	@Override
	public Order[] getOrdersByUserId(int userId) {
		// <write your code here>
		Order[] o=new DefaultOrder[DEFAULT_ORDER_CAPACITY];
		int j=0;
		for(int i=0;i<orders.length;i++) {
			if(orders[i].getCustomerId()==userId) {
				o[j++]=orders[i];
				//break;
			}
		}
		
		return o;
	}

	@Override
	public Order[] getOrders() {
		// <write your code here>
		return null;
	}
	
	void clearServiceState() {
		// <write your code here>
	}

}
