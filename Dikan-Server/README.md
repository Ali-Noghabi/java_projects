# Dikan-Server

The **backend REST API** powering the [Dikan](../README.md) marketplace. Built with **Java, Spring Boot, and SQLite**, it handles user accounts, product listings, buying, searching, and admin analytics.

> This is one half of the Dikan project — pair it with the native [Dikan-Android](../Dikan-Android) client.

---

## ✨ What It Does

- 👤 **User accounts** — sign up, log in (UUID token sessions), edit profile, and recover forgotten passwords by email
- 🛒 **Marketplace** — post, edit, delete, and search products; buy items and assign a buyer
- ⭐ **Admin analytics** — login counters, product stats, and best-seller ranking
- 🗄️ **SQLite storage** — relational `users` and `products` tables joined through JDBC

## 🧩 Main Modules

| Class | Responsibility |
|-------|----------------|
| `ApProjectApplication.java` | Spring Boot entry point + all REST controllers |
| `User.java` / `Product.java` | Domain entities |
| `Insert.java` / `Select.java` / `Edit.java` / `Delete.java` | Data access layer (SQLite JDBC) |
| `SearchProduct.java` | In-memory product search (starred items first) |
| `AdminManager.java` | Best-seller analytics |
| `Mailer.java` | Email-based password recovery |

## 🔌 API Endpoints

| Method | Path | Purpose |
|--------|------|---------|
| `POST` | `/postUser` | Sign up |
| `POST` | `/login` | Log in (issues new token, counts login) |
| `POST` | `/forgetPass` | Recover password by email |
| `POST` | `/editUser` | Update profile |
| `POST` | `/postProduct` | Add a product |
| `POST` | `/editPro` | Edit a product |
| `POST` | `/deleteProduct` | Delete a product |
| `POST` | `/getProducts` | List a user's own products |
| `GET` | `/getProducts2` | List all unsold products (+ seller info) |
| `POST` | `/search` | Search products (starred first) |
| `POST` | `/buy` | Buy a product |
| `POST` | `/changeStar` | Toggle a product's featured status |
| `GET` | `/getUsers` / `/getProductsAdmin` | Admin: all users / products |
| `GET` | `/AM/*` | Admin: login counters & best seller |

## 🚀 Run It

```bash
./mvnw spring-boot:run
```

The API serves on `http://localhost:8080/` by default.

## 🛠️ Tech Stack

Java · Spring Boot · SQLite (JDBC) · Gson · javax.mail · Maven

---

*Part of the **Dikan** marketplace. See the [project overview](../README.md).*
