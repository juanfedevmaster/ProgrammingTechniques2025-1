# ProgrammingTechniques2025-1

Este repositorio contiene una colección completa de ejemplos y proyectos que demuestran diversas técnicas de programación, patrones de diseño y paradigmas de desarrollo. Cada proyecto está organizado en carpetas numeradas que cubren diferentes aspectos de la programación.

## 📁 Estructura del Repositorio

### 01. ArraysAndMatrices

**Técnica:** Manipulación de arrays y matrices en Java

- Ejemplos de operaciones con arrays unidimensionales y bidimensionales
- Algoritmos de búsqueda y ordenamiento básicos

### 02. CellPhoneNumbers

**Técnica:** Validación y procesamiento de datos

- Manejo de números de teléfono celular
- Validación de formatos y patrones

### 03. TemperatureNumbers

**Técnica:** Procesamiento de datos numéricos

- Conversión de temperaturas entre diferentes escalas
- Manejo de datos meteorológicos

### 04. ReactiveParadigmPatternSuscriber

**Técnica:** Patrón Observer (Observador) - Programación Reactiva

- Implementación del patrón Observer
- Sistema de notificaciones reactivo
- Interfaces `Observer` y `Subject`
- Entidades: `NewsChannel` y `Subscriber`

### 05. ExampleOOPVehicle

**Técnica:** Programación Orientada a Objetos (POO)

- Herencia y polimorfismo
- Clases: `Bike`, `Car`, `ExampleOOPVehicle`
- Demostración de conceptos básicos de POO

### 06. PublicServicesBillOOP

**Técnica:** POO Avanzado con Entidades de Negocio

- Modelado de entidades: `Service`, `ServiceType`, `User`
- Sistema de facturación de servicios públicos
- Relaciones entre entidades

### 07. HelloWorldJavaSwing

**Técnica:** Interfaces Gráficas de Usuario (GUI)

- Aplicación básica con Java Swing
- Formularios y componentes visuales
- `Main.form` y `Main.java`

### 08. ExamplePOOJavaSwing

**Técnica:** POO con GUI

- Sistema de login con Java Swing
- Formularios: `Login.form`, `LoginSuccess.form`
- Entidad `User` para autenticación

### 09. ExamplePOOJavaSwingMDIParent

**Técnica:** Aplicaciones MDI (Multiple Document Interface)

- Ventanas internas con Java Swing
- `InternalExample.form` y `NewMDIApplication.form`
- Patrón de diseño MDI

### 10. ClassDiagramToCode

**Técnica:** Transformación de Diagramas de Clase a Código

- Entidades: `Consumible`, `Producto`, `ProductoAseo`
- Implementación de diagramas UML en código Java

### 11. SOLIDPrinciples

**Técnica:** Principios SOLID de Diseño de Software

#### Single Responsibility (Responsabilidad Única)

- `Employee`, `EmployeeRepository`, `TaxesService`
- Separación de responsabilidades

#### Open/Close (Abierto/Cerrado)

- `IRepository`, `MongoDbRepository`, `MySqlRepository`
- Extensibilidad sin modificación

#### Liskov Substitution (Sustitución de Liskov)

- `Figure`, `Circle`, `Triangle`
- Herencia correcta y polimorfismo

#### Interface Segregation (Segregación de Interfaces)

- `IPrinter`, `IScanner`, `MultiFunctionDevice`
- Interfaces específicas y cohesivas

#### Dependency Inversion (Inversión de Dependencias)

- `IMotor`, `BMWE30`, `MotorM1000RR`
- Dependencias hacia abstracciones

### 12. GitExample

**Técnica:** Control de Versiones con Git

- Ejemplos de uso de Git
- Clases: `GitExample`, `Person`
- Demostración de comandos básicos

### 13. LoginExampleWithFiles

**Técnica:** Persistencia de Datos y Manejo de Archivos

- Repositorios: `AccesorioRepository`, `LogicRepository`, `LoginRepositoryMongoDb`
- Lógica de negocio: `ServiceLogin`
- Entidades complejas con interfaces: `IFreno`, `IMotor`
- Manejo de archivos JSON y TXT
- Aplicación Swing con persistencia

### 14. LoginExampleWithFiles (Maven)

**Técnica:** Proyecto Maven con estructura estándar

- Configuración `pom.xml`
- Estructura de carpetas Maven
- Separación de lógica de negocio y entidades

### 15. FunctionalProgramming

**Técnica:** Programación Funcional

- Proyecto Maven para programación funcional
- Conceptos de funciones puras y inmutabilidad

### 16. FirstWebProject

**Técnica:** Desarrollo Web Básico

- Proyecto web con Maven
- Configuración JPA (`persistence.xml`)
- Estructura webapp con `web.xml` y `beans.xml`

### 17. MyFirstWebApp

**Técnica:** Desarrollo Web con HTML/CSS

- Páginas HTML: `EjemploBasico.html`, `EjemploContenedores.html`
- Estilos CSS en carpeta `styles/`
- Configuración web completa

### 18. WebTableExample

**Técnica:** Desarrollo Web con JSP

- Páginas JSP: `index.jsp`, `actualizar_vehiculos.jsp`, `registro_vehiculos.jsp`
- Entidades: `Vehiculo`
- Servicios: `VehiculoServicio`
- Repositorios: `VehiculoRepositorio`
- Estilos CSS integrados

### AdivineNumero

**Técnica:** Juegos y Lógica de Programación

- Juego de adivinanza de números
- Algoritmos de búsqueda y lógica de juego

### DependencyInjectionExample

**Técnica:** Inyección de Dependencias

- Componentes: `MotorM1000RR`, `MotorS1000RR`, `MotorSerieM3`
- Interfaces: `IMotor`
- Vehículos: `BmwM3`, `BmwSerie3`
- Aplicación: `HolaMundoApp`

### JavaWithMavenExample

**Técnica:** Configuración Maven Básica

- Estructura estándar de proyecto Maven
- Configuración `pom.xml`

### SOLIDExample

**Técnica:** Ejemplos Prácticos de Principios SOLID

- `Empleado`, `EmpleadoMongoDB`, `EmpleadoOracleSQL`
- Interfaces: `IRepositorio`
- Implementación de todos los principios SOLID

## 🛠️ Tecnologías Utilizadas

- **Java**: Lenguaje principal de programación
- **Java Swing**: Interfaces gráficas de usuario
- **Maven**: Gestión de dependencias y construcción
- **JPA**: Persistencia de datos
- **JSP**: Páginas dinámicas web
- **HTML/CSS**: Frontend web
- **Git**: Control de versiones
- **JSON**: Intercambio de datos
- **MongoDB**: Base de datos NoSQL

## 📚 Conceptos Cubiertos

### Paradigmas de Programación

- Programación Orientada a Objetos (POO)
- Programación Funcional
- Programación Reactiva

### Patrones de Diseño

- Observer (Observador)
- Dependency Injection (Inyección de Dependencias)
- Repository (Repositorio)
- MDI (Multiple Document Interface)

### Principios de Diseño

- Principios SOLID
- Clean Code
- Separation of Concerns

### Arquitectura de Software

- Capas de presentación, lógica de negocio y persistencia
- Interfaces y abstracciones
- Inversión de dependencias

## 🚀 Cómo Usar

1. **Clona el repositorio:**

   ```bash
   git clone https://github.com/juanfedevmaster/ProgrammingTechniques2025-1.git
   ```

2. **Navega a cualquier proyecto:**

   ```bash
   cd ProgrammingTechniques2025/[NOMBRE_PROYECTO]
   ```

3. **Compila y ejecuta:**
   - Para proyectos NetBeans: Abre en NetBeans IDE
   - Para proyectos Maven: `mvn clean install`
   - Para proyectos web: Despliega en servidor web

## 📖 Aprendizaje

Este repositorio está diseñado para aprender progresivamente:

1. Comienza con los proyectos básicos (01-03)
2. Avanza a POO (05-06)
3. Explora GUI (07-09)
4. Estudia principios SOLID (11)
5. Practica desarrollo web (16-18)
6. Aplica patrones avanzados (04, 13)

## 🤝 Contribuciones

Las contribuciones son bienvenidas. Por favor:

1. Fork el repositorio
2. Crea una rama para tu feature
3. Commit tus cambios
4. Push a la rama
5. Abre un Pull Request

## 📄 Licencia

Este proyecto está bajo la Licencia MIT. Ver el archivo `LICENSE` para más detalles.

---

**Desarrollado con ❤️ para el aprendizaje de técnicas de programación**
