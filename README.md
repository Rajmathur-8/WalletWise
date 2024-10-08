# Expense and Income Tracker

## Overview

The **Expense and Income Tracker** is a full-stack web application designed to help users manage their finances by tracking expenses and income. The app features a comprehensive dashboard displaying total expenses, total income, recent transactions, and visual insights via a line graph. It also includes easy-to-use sidebar options for adding and viewing past income and expenses.

## Features

- **Dashboard**: Displays key financial metrics including:
  - Total Expenses
  - Total Income
  - Recent Expenses
  - Recent Income
  - Minimum and Maximum Expenses
  - Minimum and Maximum Income
  - Visual representation of data using a line graph (Chart.js)

- **Sidebar Navigation**:
  - Add new income entries
  - Add new expense entries
  - View past income and expense records

## Technologies Used

### Backend
- **Spring Boot**: Used for creating the backend REST API.
- **Spring Web**: Handles HTTP requests and routes them to the appropriate controllers.
- **Spring Data JPA**: Manages database interactions with entities and repositories.

### Frontend
- **Angular**: A frontend framework used for building dynamic user interfaces.
- **Chart.js**: A JavaScript library used to create a line graph for visualizing financial data.

## Installation

### Prerequisites
- Java 17+
- Node.js 18+
- Angular CLI
- MySQL

### Backend Setup

1. **Clone the repository**:
    ```bash
    git clone https://github.com/yourusername/expense-income-tracker.git
    cd expense-income-tracker/backend
    ```

2. **Set up MySQL Database**:
    - Create a new database in MySQL (e.g., `expense_tracker_db`).
    - Update the `application.properties` or `application.yml` file in `src/main/resources` with your MySQL database credentials.

3. **Build and Run the Spring Boot Application**:
    ```bash
    ./mvnw clean install
    ./mvnw spring-boot:run
    ```

    The backend server should now be running at `http://localhost:8080`.

### Frontend Setup

1. **Navigate to the frontend directory**:
    ```bash
    cd ../frontend
    ```

2. **Install dependencies**:
    ```bash
    npm install
    ```

3. **Run the Angular Development Server**:
    ```bash
    ng serve
    ```

    The frontend server should now be running at `http://localhost:4200`.

## Usage

- Access the application at `http://localhost:4200`.
- Use the dashboard to get a snapshot of your financial status.
- Add income or expense records via the sidebar options.
- View past records and analyze trends using the line graph.

## Project Structure

### Backend ()
- **Controllers**: Handle incoming HTTP requests and map them to services.
- **Services**: Contain business logic and interact with repositories.
- **Repositories**: Interact with the database using Spring Data JPA.
- **Entities**: Define the data model.

### Frontend ()
- **Components**: Angular components representing different parts of the UI.
- **Services**: Handle communication with the backend API.
- **Models**: Define the structure of data used in the frontend.

## API Endpoints

- **GET /api/expenses**: Retrieve all expenses.
- **GET /api/incomes**: Retrieve all income records.
- **POST /api/expenses**: Add a new expense.
- **POST /api/incomes**: Add a new income.
- **GET /api/dashboard**: Retrieve data for the dashboard (total income, total expenses, etc.).

## Contributing

1. Fork the repository.
2. Create a new branch (`git checkout -b feature/your-feature-name`).
3. Make your changes.
4. Commit your changes (`git commit -m 'Add new feature'`).
5. Push to the branch (`git push origin feature/your-feature-name`).
6. Create a Pull Request.

