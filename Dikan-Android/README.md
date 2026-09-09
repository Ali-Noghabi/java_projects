# Dikan-Android

The native **Android client** for the [Dikan](../README.md) marketplace. Built with **Java and the Android SDK**, it lets users buy and sell, manage their own shop, and gives administrators a full management panel.

> This app talks to the [Dikan-Server](../Dikan-Server) REST API over Retrofit.

---

## ✨ Features

- 🔐 **Accounts** — sign up, log in, and recover a forgotten password by email
- 🛍️ **Marketplace** — browse listings with photos, live search, and pull-to-refresh
- 💰 **Price sorting** — sort products low→high or high→low
- 📞 **Product detail** — view full info, call the seller, and buy with one tap
- 🏪 **Seller shop** — add, edit, and delete your own ads with image upload
- 🛡️ **Admin panel** — live stats dashboard, featured-product (star) management, and user monitoring
- 🌐 **Bilingual & RTL** — full English + Persian localization

## 🖥️ User Interface

<p align="center">
  <img src="project-onlineshop.png" alt="Dikan Android UI" width="420"/>
</p>

## 🔗 Architecture

The app uses **Retrofit + Gson** to call the Dikan server:

- `Controler.java` — shared state (session token, name, phone) and server base URL
- `MainAPI.java` — Retrofit interface declaring all REST endpoints
- `MainActivity.java` — login / admin entry point
- `SearchViewPage.java` — main product hub (list, search, sort, navigation drawer)
- `ProductPage.java` — product detail & buy
- `AddProduct.java` / `UpdateDeleteProduct.java` — seller ad management
- `LastActivity.java` — the user's own shop
- `AdminManager.java` / `AdminProducts.java` / `AdminUsers.java` — admin panel
- `MyRecyclerViewAdapter*` — RecyclerView adapters for lists and cards

## 🚀 Run It

1. Open this folder in **Android Studio**.
2. In `Controler.java`, set the base URL to your running [Dikan-Server](http://127.0.0.1:8080/) instance.
3. Build and run on a device or emulator (min SDK 22).

## 🛠️ Tech Stack

Java 8 · Android SDK 30 · Retrofit & Gson · Material Components · RecyclerView · NavigationView · ViewBinding

---

*Part of the **Dikan** marketplace. See the [project overview](../README.md).*
