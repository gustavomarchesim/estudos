## Predicate

O Predicate é uma interface funcional.

```Java
public interface Predicate<T>{
    
    boolean test(T t)
}
```

### Problema exemplo
Fazer um programa que, a partir de uma lista de produtos, remova da lista somente aqueles cujo preço mínimo seja 100.

```Java
List<Product> list = new ArrayList<>();

list.add(new Product("TV", 900.00));
list.add(new Product("Mouse", 50.00));
list.add(new Product("Tablet", 350.00));
list.add(new Product("HD Case", 90.50));
```