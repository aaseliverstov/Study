public class Product {
    private String title;
    private float prise;

    public Product(String title, float prise) {
        this.title = title;
        this.prise = prise;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getPrise() {
        return prise;
    }

    public void setPrise(float prise) {
        this.prise = prise;
    }
}
