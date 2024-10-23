# Property Prices App

## Overview

The Property Prices App is a Java application designed to display property prices across various provinces in South Africa. It allows users to view prices for different property types — Flats, Townhouses, and Houses—and calculates the average property prices for each province, formatted for easy readability.

## Features

- Displays a structured table of property prices by province and property type.
- Calculates and displays the average property prices for each province.
- Formats output with currency symbols and comma separators for thousands.

## Technologies Used

- Java 8 or higher
- JDK (Java Development Kit)

## Getting Started

### Prerequisites

To run this application, ensure you have the following installed:

- Java Development Kit (JDK)
- An IDE (e.g., IntelliJ IDEA, Eclipse) or a text editor

### How to Run

1. Clone the repository to your local machine:
   ```bash
   git clone https://github.com/HChristopherNaoyuki/property-prices-app.git
   ```

2. Navigate to the project directory:
   ```bash
   cd PropertyPricesApp
   ```

3. Compile the Java file:
   ```bash
   javac PropertyPricesApp.java
   ```

4. Run the application:
   ```bash
   java PropertyPricesApp
   ```

## Output

The application will display a table of property prices for Gauteng, Natal, and Cape, along with the average property prices for each province formatted with currency symbols.

```
              FLAT      TOWNHOUSE    HOUSE      
--------------------------------------------
Gauteng    R 800,000 R 1,500,000 R 2,000,000
Natal      R 700,000 R 1,200,000 R 1,600,000
Cape       R 750,000 R 1,300,000 R 1,800,000

Average property prices in Gauteng:   R 1,433,333
Average property prices in Natal:     R 1,166,667
Average property prices in Cape:      R 1,340,000
```

## License

This project is licensed under the MIT License. See the LICENSE file for more details.

---
