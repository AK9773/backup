package stream_api;

public class Product {

	private int productId;
	private String productName;
	private int productCost;
	private int orderId;
	private String customerName;

	public Product() {

		super();
	}

	public Product(int productId, String productName, int productCost, int orderId, String customerName) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productCost = productCost;
		this.orderId = orderId;
		this.customerName = customerName;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductCost() {
		return productCost;
	}

	public void setProductCost(int productCost) {
		this.productCost = productCost;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productCost=" + productCost
				+ ", orderId=" + orderId + ", customerName=" + customerName + "]";
	}

}
