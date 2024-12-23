# Sistem Informasi Sekolah

A Java-based academic information system that manages data for students and teachers in an educational institution.

## Description

This system implements object-oriented programming principles to handle academic data management, featuring inheritance from a base `CivitasAkademika` class to specific `Siswa` (Student) and `Guru` (Teacher) classes.

## Key Features

- Student data management (Name, Age, Student ID, Class)
- Teacher data management (Name, Age, Teacher ID, Subject)
- Abstract base class implementation
- Data loading utility
- Entity description functionality

## Prerequisites

- Java Development Kit (JDK) 8 or higher
- Java IDE (Eclipse, IntelliJ IDEA, or NetBeans)
- Maven (optional, if using build automation)

## Project Structure

```bash
SistemInformasiSekolah/
├── pom.xml
├── README.md
└── src/
    ├── main/
    │   └── java/
    │       ├── me/
    │       │   └── creativerees/
    │       │       └── sisteminformasisekolah/
    │       │           └── SistemInformasiSekolah.java
    │       └── entitas/
    │       │   ├── CivitasAkademika.java
    │       │   ├── Guru.java
    │       │   └── Siswa.java
    │       └── utilitas/
    │           └── DataLoader.java
    └── test/
        └── java/
```

## Class Structure

- `CivitasAkademika`: Abstract base class containing common attributes (nama, umur)
- `Siswa`: Student class extending CivitasAkademika (adds nim, kelas)
- `Guru`: Teacher class extending CivitasAkademika (adds nid, mataPelajaran)
- `DataLoader`: Utility class for loading sample data

## Author

- [M'HALFIRZZHATULLAH](https://github.com/Halfirzzha)
- [MICHAEL ANDREA AQUINO](https://github.com/mianaqu-f)
  
## License
- [Creative Trees](https://github.com/Creative-Trees)


## Installation

1. Clone the repository:
```bash
git clone https://github.com/Creative-Trees/Sistem-Informasi-Sekolah
```
