package by.lab4.repository;

import java.util.List;

import by.lab4.entity.CreditCard;
import by.lab4.specification.Specification;

public class CreditCardRepository implements Repository<CreditCard> {

    @Override
    public boolean add(CreditCard entity) {
        return false;
    }

    @Override
    public boolean remove(CreditCard entity) {
        return false;
    }

    @Override
    public boolean update(CreditCard entity) {
        return false;
    }

    @Override
    public List<CreditCard> query(Specification specification) {
        return null;
    }
}
