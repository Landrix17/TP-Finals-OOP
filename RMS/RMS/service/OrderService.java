package RMS.service;

import java.util.ArrayList;
import RMS.model.Cart;
import RMS.model.CartItem;

public class OrderService {

    private Cart cart;

    public OrderService() {
        this.cart = new Cart(new ArrayList<>(), 0);
    }

    public void addToCart(CartItem cartItem) {
        this.cart.addItemToCart(cartItem);
    }

    public void clearCart() {
        this.cart = new Cart(new ArrayList<>(), 0);
    }

    public Cart getCart() {
        return this.cart;
    }
}