## Consumer

- **Link de referência**: https://docs.oracle.com/javase/10/docs/api/java/util/function/Consumer.html


```Java
public interface Consumer<T> {
    void accept(T t)
}
```
### Problema exemplo

Fazer um programa que, a partir de uma lista de produtos, aumente o
preço dos produtos em 10%.

```Java
List<Product> list = new ArrayList<>();

list.add(new Product("Tv", 900.00));
list.add(new Product("Mouse", 50.00));
list.add(new Product("Tablet", 350.50));
list.add(new Product("HD Case", 80.90));
```