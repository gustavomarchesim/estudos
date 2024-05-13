# Map<K,V>

• https://docs.oracle.com/javase/10/docs/api/java/util/Map.html

-  É uma coleção de pares chave / valor
- Não admite repetições do objeto chave
- Os elementos são indexados pelo objeto chave (não possuem posição)
- Acesso, inserção e remoção de elementos são rápidos
- Uso comum: cookies, local storage, qualquer modelo chave-valor

## Principais implementações:
- **HashMap** - mais rápido (operações O(1) em tabela hash) e não ordenado
- **TreeMap** - mais lento (operações O(log(n)) em árvore rubro-negra) e ordenado pelo
compareTo do objeto (ou Comparator)
- **LinkedHashMap** - velocidade intermediária e elementos na ordem em que são adicionados