package ImmutableCls;

final class Shop {

	private String shopNumber;
	private String ownerName;

	public Shop(String shopNumber, String ownerName) {
		this.shopNumber = shopNumber;
		this.ownerName = ownerName;
	}

	public String getShopNumber() {
		return shopNumber;
	}

	public String getOwnerName() {
		return ownerName;
	}

}
