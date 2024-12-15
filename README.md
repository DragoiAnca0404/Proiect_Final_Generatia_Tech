# Online Store API

Această aplicație este construită cu Spring Boot și implementează principiile **CRUD** pentru gestionarea eficientă a comenzilor și produselor într-o aplicație de magazin online. 

## Tehnologii Folosite
- **Spring Boot**: Framework pentru dezvoltarea rapidă a aplicațiilor web și API-urilor.
- **Spring Data JPA**: Framework pentru manipularea bazelor de date relaționale, care facilitează interacțiunea cu baza de date folosind obiecte Java.
- **H2 Database**: Bază de date relationala pentru stocarea informatiilor cheie
- **REST API**: GET, POST, PUT, DELETE

## Funcționalități

### 1. **Entitatea `Order`**
Reprezintă o comandă plasată de un client. Aceasta include următoarele câmpuri:
- **`id`**: ID-ul unic al comenzii (generat automat).
- **`customerName`**: Numele clientului care a plasat comanda.
- **`totalAmount`**: Valoarea totală a comenzii.

Această entitate este mapată pe tabelul **`orders`** din baza de date.

### 2. **Entitatea `Product`**
Reprezintă un produs disponibil în aplicație, cu următoarele câmpuri:
- **`id`**: ID-ul unic al produsului.
- **`name`**: Numele produsului.
- **`description`**: Descrierea produsului.
- **`price`**: Prețul produsului.
- **`stockQuantity`**: Cantitatea disponibilă în stoc.

### 3. **Controllerul `ProductController`**
Acesta expune API-uri pentru gestionarea produselor:
- **`GET /api/products`**: Obține toate produsele din baza de date.
- **`GET /api/products/{id}`**: Obține un produs specificat de ID.
- **`POST /api/products`**: Crează un produs nou în baza de date.

### 4. **Controllerul `OrderController`**
Acesta expune un API pentru crearea comenzilor:
- **`POST /api/orders`**: Permite crearea unei comenzi noi, care include informații despre client și totalul comenzii.

### 5. **Logica de Servicii**
- **`ProductService`**: Conține logica de afaceri pentru gestionarea produselor, cum ar fi salvarea și obținerea produselor din baza de date.
- **`OrderService`**: Conține logica de afaceri pentru gestionarea comenzilor, cum ar fi crearea comenzilor și salvarea acestora în baza de date.

### 6. **Endpointuri API**
- **`GET /api/products`**: Returnează lista tuturor produselor.
- **`GET /api/products/{id}`**: Returnează un produs specificat de ID.
- **`POST /api/products`**: Permite crearea unui produs nou.
- **`POST /api/orders`**: Permite crearea unei comenzi noi, cu informațiile clientului și totalul comenzii.

- ![image](https://github.com/user-attachments/assets/1849e508-1929-4f50-9d0e-9b6751373265)
- ![image](https://github.com/user-attachments/assets/3c7d4185-52e8-40b4-b593-3fcdbc169c2d)
- ![image](https://github.com/user-attachments/assets/5bce6239-65d1-4156-b357-d367951c815a)





