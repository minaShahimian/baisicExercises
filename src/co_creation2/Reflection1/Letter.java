package co_creation2.Reflection1;

public class Letter {

    private String address;
    private Boolean isStamped;

    public Letter(String address, Boolean isStamped) {
        this.address = address;
        this.isStamped = isStamped;
    }

    public String getAddress() {
        return address;
    }

    public void setStamped(Boolean stamped) {
        isStamped = stamped;
    }

    public Boolean isStamped(Letter letter) {
        return isStamped;
    }
}
