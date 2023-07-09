import java.util.Random;

public class mainApp {

    static Customer[] customers = null;
    static Product[] products = null;

    public static void main(String[] arg) {

        customers = new Customer[] {

                new Customer("Ivan", "Semenov", 25, "+79604564444", Gender.male),
                new Customer("Petr", "Kolosov", 32, "+796045654232", Gender.male)
        };

        products = new Product[]{
                new Product("Milk", 100.5f),
                new Product("Bread", 70.8f),
                new Product("Meat", 1000),
                new Product("Chocolate", 255.6f),
                new Product("Tea", 300)
        };

        Order[] orders = new Order[5];

        String[] phones = {"+79604564444","+796045654232","+734556555","+796045654232", "+79604564444"};
        String[] productTitles = {"Milk", "Water", "Meat", "Tea", "Chocolate"};
        int[] amounts = {4,5,101,0,-1};

        System.out.println("Продукт: " + products[0].getTitle() + " стоимость до применения скидки: " + products[0].getPrise());
        setDiscount(productTitles[0]);
        System.out.println("Продукт: " + products[0].getTitle() + " стоимость после применения скидки: " + products[0].getPrise());
        System.out.println();

        int count = 0;
        for (int i = 0; i < 5; i++) {
            try {
                orders[i] = makePurchase(phones[i], productTitles[i],amounts[i]);
                count++;
            } catch (ProductException e) {
                System.out.println(e.getMessage());
            } catch (AmountException e) {
                orders[i] = makePurchase(phones[i], productTitles[i],1);
                count++;

            } catch (CustomerException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Количество совершенных покупок: " + count);
    }

    public static Order makePurchase(String phone, String title, int amount) throws ProductException, CustomerException, AmountException {
        Customer customer = null;
        Product product = null;

        for (Customer c: customers) {
            if (c.getPhone().equals(phone)) {
                customer = c;
            }
        }
        for (Product p: products) {
            if (p.getTitle().equals(title)) {
                product = p;
            }
        }
        if (customer == null) {
            throw new CustomerException("Customer not found");
        }

        if (product == null) {
            throw new ProductException("Product not found");
        }

        if ((amount > 100) || (amount < 1)){
            throw new AmountException("Amount is not correct");
        }
        return new Order(customer, product, amount);
    }

    public static void setDiscount(String titleProduct) {
        Random random = new Random();
        int num = random.nextInt(Discount.values().length);

        for (Product p: products) {
            if (p.getTitle().equals(titleProduct)) {
                p.setPrise(p.getPrise() - ((p.getPrise() / 100) * Discount.values()[num].getValue()));
            }
        }
    }
}
