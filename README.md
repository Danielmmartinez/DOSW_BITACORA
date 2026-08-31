# SEMANA No 1 — DOSW Manejo de Streams



## Datos personales:

- Nombre y Apellido: Daniel Mosquera

- Código de Estudiante: 1000099251

- Curso: DOSW



--- 



### Ejercicio 01 — Filtrado de Números Pares Mayores a Diez



Dada una lista de números enteros, necesitamos obtener una nueva lista solo con los números pares mayores a diez.
Datos de Entrada: List<Integer> numbers = List.of(3,8,10,12,15,18,20)



**Código implementado:** 
```java
import java.util.List;

public class EjercicioPres1 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(3, 8, 10, 12, 15, 18, 20); 

        
        List<Integer> result = numbers.stream()
                .filter(n -> n % 2 == 0 && n > 10)
                .toList();

        System.out.println(result); 
    }
}
```

**Captura de ejecución:** 

![Imagen](./imagenes/Ejercicio1Semana1.png)

**Explicación:** Mediante la API de Streams se aplica un filtro declarativo filter(n -> n % 2 == 0 && n > 10) para
evaluar simultáneamente la paridad y que el valor supere a 10. Finalmente, se recolectan los elementos filtrados en una
lista mediante toList()



### Ejercicio 02 — Procesamiento y Transformación de Cadenas

Dada una lista de palabras, se requiere:
* Filtrar las palabras que tengan más de 4 caracteres.
* Convertirlas en Mayúsculas.
* Ordenarlas alfabéticamente.
* Obtener la cantidad total de palabras resultantes.

**Codigo Implementado**

```java
import java.util.List;

public class EjercicioPres2 {
    public static void main(String[] args) {
        List<String> words = List.of("java", "stream", "api", "functional", "code", "git"); 
        
        List<String> processedWords = words.stream()
                .filter(w -> w.length() > 4)
                .map(String::toUpperCase)
                .sorted()
                .toList();

        
        long totalCount = processedWords.size();
        
        System.out.println("Palabras resultantes: " + processedWords);
        System.out.println("Cantidad total: " + totalCount);          
    }
}
```
**Captura de ejecución:**

![Imagen](./imagenes/Ejercicio2Semana1.png)

**Explicación:** Se descartan las cadenas con longitud menor o igual a 4 caracteres utilizando filter. Luego se
transforman a mayúsculas con map(String::toUpperCase), se ordenan con sorted() y se obtiene el total de palabras mediante
size()

### Ejercicio 03 - Filtrado y Ordenamiento de Usuarios Activos
Dada una lista de usuarios con los atributos id, name, age y active:
* Filtrar únicamente los usuarios activos.
* Obtener una lista con los nombres en mayúscula.
* Ordenar alfabéticamente el resultado.

**Codigo implementado**
```java
import java.util.List;

public class EjercicioPres3 {
    public static class User {
        private String id;
        private String name;
        private int age;
        private boolean active;

        public User(String id, String name, int age, boolean active) {
            this.id = id;
            this.name = name;
            this.age = age;
            this.active = active;
        }

        public String getName() { return name; }
        public int getAge() { return age; }
        public boolean isActive() { return active; }
    }

    public static void main(String[] args) {
        List<User> users = List.of(
                new User("1", "Carlos", 25, true),
                new User("2", "Ana", 22, false),
                new User("3", "Beatriz", 20, true)
        );

        
        List<String> result = users.stream()
                .filter(User::isActive)
                .map(u -> u.getName().toUpperCase())
                .sorted()
                .toList();

        System.out.println(result); 
    }
}
```
**Captura de ejecución:**

![Imagen](./imagenes/Ejercicio3Semana1.png)

**Explicación:** La canalización de Stream filtra primero los objetos User cuya propiedad active sea true. Posteriormente,
transforma cada objeto al nombre en mayúsculas mediante map y los ordena alfabéticamente con sorted().

### Ejercicio 04 - Obtención de Nombres de Usuarios Mayores de Edad

Dado un listado de Usuarios y utilizando los mismos atributos anteriores, filtrar las personas mayores de edad (edad >= 18)
y obtener sus nombres.

**Codigo implementado**
```java
import java.util.List;

public class EjercicioPres4 {
    // Definición independiente del modelo User dentro de la clase
    public static class User {
        private String id;
        private String name;
        private int age;
        private boolean active;

        public User(String id, String name, int age, boolean active) {
            this.id = id;
            this.name = name;
            this.age = age;
            this.active = active;
        }

        public String getName() { return name; }
        public int getAge() { return age; }
        public boolean isActive() { return active; }
    }

    public static void main(String[] args) {
        List<User> users = List.of(
                new User("1", "Carlos", 25, true),
                new User("2", "Ana", 22, false),
                new User("3", "Beatriz", 20, true)
        );

        List<String> adultNames = users.stream()
                .filter(u -> u.getAge() >= 18)
                .map(User::getName)
                .toList();

        System.out.println(adultNames); 
    }
}

```
**Captura de ejecución:**

![Imagen](./imagenes/Ejercicio4Semana1.png)

**Explicación:** Mediante filter(u -> u.getAge() >= 18) se obtienen las personas mayores de edad y con map(User::getName)
se extraen únicamente sus nombres.

### Ejercicio 05 - Validación de Lote de Transacciones Bancarias

Dada una lista de transacciones bancarias representadas por objetos Transaction, se requiere procesar la lista usando 
Streams para:
* Usar peek para ver cada transacción procesada (utilizando System.out.println).
* Verificar si existe al menos una transacción no aprobada.
* Retornar true o false indicando si el lote de transacciones es válido. 

**Codigo implementado**
```java
import java.util.List;

public class EjercicioPres5 {
    public static class Transaction {
        String id;
        double amount;
        boolean approved;

        public Transaction(String id, double amount, boolean approved) {
            this.id = id;
            this.amount = amount;
            this.approved = approved;
        }

        public boolean isApproved() { return approved; }

        @Override
        public String toString() {
            return "Transaction[id=" + id + ", amount=" + amount + ", approved=" + approved + "]";
        }
    }

    public static void main(String[] args) {
        List<Transaction> transactions = List.of(
                new Transaction("TX1", 100.0, true),
                new Transaction("TX2", 250.0, false),
                new Transaction("TX3", 50.0, true)
        );

        
        boolean isBatchValid = transactions.stream()
                .peek(t -> System.out.println("Procesando: " + t))
                .noneMatch(t -> !t.isApproved());                 

        System.out.println("¿Lote válido?: " + isBatchValid); 
    }
}
```

**Captura de ejecución:**

![Imagen](./imagenes/Ejercicio5Semana1.png)

**Explicación:** La operación intermedia peek permite imprimir la información de cada transacción a medida que es evaluada.
La operación terminal noneMatch(t -> !t.isApproved()) verifica que no existan elementos desaprobados;
al encontrar TX2, termina la ejecución y retorna false, declarando inválido el lote.
