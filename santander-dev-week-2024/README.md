![Santander | Open Academy](https://pro-becas-images-s3.s3.eu-west-1.amazonaws.com/images/logo-soa.svg)

# **SANTANDER DEV WEEK 2024**

### **Idiomas | Languages | Idiomas**

- Português: **PT-AO**
- English: **EN-US**
- Español: **ES-ES**

### 📚 **Descrição do Projecto | Project Description | Descripción del Proyecto**

👉 **PT-AO**

>> Este projecto visa no desenvolvimento de uma aplicação, seguindo os padrões actuais de desenvolvimento da indústria de _software_; permitindo demonstrar o funcionamento das IA (**Inteligências Artificiais**) e a sua integração em aplicações modernas.
>
>> ℹ **Objectivo Principal:** permitir que os utilizadores finais possam conversar com os campeões do **_League of Legends_ (LOL)**. Para tal, utilizou-se algumas das mais recentes **Inteligências Artificiais (IAs) Generativas**, possibilitando que a API desenvolvida "entenda" a personalidade única de cada campeão, para criar interacções que capturem a sua essência, o que torna cada conversa uma experiência única.

**PT-AO** 👈

👉 **EN-US**

>> This project aims to develop an application, following the current development standards of the software industry; making it possible to demonstrate how AI (**Artificial Intelligence**) works and how it can be integrated into modern applications.
>
>> ℹ **Main Objective:** allow end users to chat with **League of Legends (LOL)** champions. To this end, some of the latest **Generative Artificial Intelligences (AIs)** were used, enabling the developed API to "understand" the unique personality of each champion, to create interactions that capture their essence, making each conversation a unique experience.

**EN-US** 👈

👉 **ES-ES**

>> Este proyecto tiene como objetivo desarrollar una aplicación, siguiendo los estándares de desarrollo actuales de la industria del _software_; para demostrar cómo funciona la IA (**Inteligencia Artificial**) y cómo puede integrarse en las aplicaciones modernas.
>
>> ℹ **Objetivo Principal:** permitir a los usuarios finales para que puedan chatear con los campeones de **_League of Legends_ (LOL)**. Para ello, se han utilizado algunas de las más recientes **Inteligencias Artificiales Generativas (IA)**, que permiten a la API desarrollada "entender" la personalidad única de cada campeón, para crear interacciones que capten su esencia, lo que hace de cada conversación una experiencia única.

**ES-ES** 👈

### 📊 **Status do Projecto | Project Status | Estado del Proyecto**

Concluído... | Finished... | Finalizado... ✅

### 📋 **Tabela de Conteúdos | Content Table | Tabla de Contenido**

===================================================================

<!--ts-->
* [Arquitectura do Projecto | Project Architecture | Arquitectura del Proyecto](#🏛️-arquitectura-do-projecto--project-architecture--arquitectura-del-proyecto)
* [Stack de Desenvolvimento | Development Stack | Stack de desarrollo](#🛠-stack-de-desenvolvimento--development-stack--stack-de-desarrollo)
* [Estrutura de Pastas | Folder Structure | Estrutura de Carpetas](#📂-estrutura-de-pastas--folder-structure--estrutura-de-carpetas)
* [Plano de Desenvolvimento | Development Plan | Plan de Desarrollo](#📝-plano-de-desenvolvimento--development-plan--plan-de-desarrollo)

### 🏛️ **Arquitectura do Projecto | Project Architecture | Arquitectura del Proyecto**

👉 **PT-AO**

>> Este projecto foi desenhado com destaque na separação das responsabilidades entre as camadas. Desde a interface de utilizador até aos mecanismos de interacção com sistemas externos, passando por adaptadores, casos de uso e as entidades centrais do domínio, cada elemento é estrategicamente posicionado para reforçar a modularidade, a escalabilidade e a fácil manutenção do sistema. O que se pretende é facilitar a compreensão de como os componentes colaboram para a realização dos objectivos do _software_, alinhando-se assim, aos princípios da **_Clean Architecture_**.

**PT-AO** 👈

👉 **EN-US**

>> This project was designed with emphasis on the separation of responsibilities between the layers. From the user interface to the interaction mechanisms with external systems, including adapters, use cases and the central entities of the domain, each element is strategically positioned to reinforce the modularity, scalability and easy maintenance of the system. The aim is to facilitate the understanding of how the components collaborate to achieve the objectives of the software, thus aligning with the principles of **Clean Architecture**.

**EN-US** 👈

👉 **ES-ES**

>> Este proyecto fue diseñado con énfasis en la separación de responsabilidades entre las capas. Desde la interfaz de usuario hasta los mecanismos de interacción con sistemas externos, pasando por los adaptadores, los casos de uso y las entidades centrales del dominio, cada elemento está estratégicamente situado para reforzar la modularidad, escalabilidad y fácil mantenimiento del sistema. El objetivo es facilitar la comprensión de cómo los componentes colaboran para lograr los objetivos del _software_, en consonancia con los principios de la **_Clean Architecture_**.

**ES-ES** 👈

### 🛠 **Stack de Desenvolvimento | Development Stack | Stack de desarrollo**

- **Linguagens de Programação | Programming Languages | Lenguajes de Programación**
  >
  >> **![Java](https://img.shields.io/badge/java-blue.svg?style=for-the-badge&logo=openjdk&logoColor=white)**

- **IDE**
  >
  >> **[IntelliJ IDEA Community Edition](https://www.jetbrains.com/idea/download)**

- **Outras Tecnologias | Other Technologies | Otras tecnologías**
  >
  >> **[JDK 21](https://www.oracle.com/br/java/technologies/downloads/#java21)**
  >
  >> **[AWS Elastic Beanstalk](https://aws.amazon.com/elasticbeanstalk)** : para a publicação da API REST na Nuvem | for publishing the REST API in the Cloud | para publicar la API REST en la Nube
  >
  >> **[GPT](https://platform.openai.com/docs/api-reference/chat/create) / [Gemini](https://ai.google.dev/tutorials/rest_quickstart#text-only_input)** : inteligências artificiais que podem ser utilizadas para este projecto | artificial intelligences that can be used for this project | inteligencias artificiales que pueden utilizarse para este proyecto

- **Gestor de Pacotes | Package Manager | Gestor de Dependencias**

  - [x]  **Gradle**
  - [ ]  **Maven**

- **Dependências | Dependencies | Dependencias**
  >
  >> - **Spring Web:** desenvolvimento de APIs REST, exposição de _endpoints_, etc | APIs REST development, endpoints displaying, etc | desarrollo de API REST, exposición de _endpoints_, etc
  >
  >> - **Spring Data JDBC:** camada de persistência para base de dados em SQL | persistence layer for SQL database | capa de persistencia para bases de datos SQL
  >
  >> - **H2 Database:** base de dados de processamento muito rápido, podendo funcionar na memória RAM e com uma ocupação de memória de até 2MB | very fast processing database, capable of running in RAM memory and with a memory footprint up to 2MB | base de datos de procesamiento muy rápido que puede ejecutarse en RAM y con una huella de memoria de hasta 2 MB
  >
  >> - **OpenFeign:** _client http_ que auxilia no consumo de APIs externas | http client that helps consume external APIs | cliente http que ayuda a consumir API externas

- **Base de Dados SQL em Memória | In-Memory SQL Database | Base de Datos SQL en Memoria**

  👉 **PT-AO**

  >> A utilização da base de dados H2 neste projecto serve como uma fundação ágil e flexível para modelar o nosso domínio de conhecimento — os campeões do LOL. Esta escolha, permite uma rápida prototipação e um ambiente de desenvolvimento eficiente, essencial para armazenar e recuperar informações detalhadas sobre cada campeão. Desta forma, garante-se que as IAs Generativas que foram integradas possam aceder à um repositório rico e detalhado, permitindo-lhes capturar com precisão a essência e a personalidade única de cada campeão, enriquecendo assim a interactividade e a profundidade das interacções realizadas.

  **PT-AO** 👈

  👉 **EN-US**

  >> Using the H2 database in this project serves as an agile and flexible foundation for modeling our knowledge domain — the LOL champions. This choice allows for rapid prototyping and an efficient development environment, which is essential for storing and retrieving detailed information about each champion. In this way, it is ensured that the Generative AIs that have been integrated can access a rich and detailed repository, allowing them to accurately capture the essence and unique personality of each champion, thus enriching the interactivity and depth of the interactions carried out.

  **EN-US** 👈

  👉 **ES-ES**

  >> El uso de la base de datos H2 en este proyecto sirve de base ágil y flexible para modelar nuestro dominio del conocimiento: los campeones de LOL. Esta elección permite la creación rápida de prototipos y un entorno de desarrollo eficiente, esencial para almacenar y recuperar información detallada sobre cada campeón. De este modo, se garantiza que las IA Generativas que se han integrado puedan acceder a un repositorio rico y detallado, que les permita capturar con precisión la esencia y personalidad única de cada campeón, enriqueciendo así la interactividad y profundidad de las interacciones realizadas.

  **ES-ES** 👈

    ```sql

    CREATE TABLE IF NOT EXISTS champions (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    role VARCHAR(255) NOT NULL,
    personality TEXT,
    image_url VARCHAR(255)
    );

    INSERT INTO champions (name, role, personality, image_url) VALUES
        ('Jinx', 'Atirador', 'Uma criminosa impulsiva e maníaca de Zaun, Jinx vive para disseminar o caos sem se preocupar com as consequências. Com um arsenal de armas mortais, ela detona as explosões mais altas e mais luminosas para deixar um rastro de destruição e pânico por onde passa. Jinx abomina o tédio e deixa alegremente sua marca caótica de pandemônio aonde quer que vá.', 'https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Jinx_0.jpg'),
        ('Vi', 'Lutador', 'Antiga criminosa das ruas violentas de Zaun, Vi é uma mulher temível, impulsiva e explosiva que tem muito pouco respeito por autoridades. Após ter crescido completamente só, Vi desenvolveu instintos de sobrevivência extremamente certeiros e um senso de humor extremamente ácido. Agora trabalhando com os Vigias de Piltover para manter a paz, ela porta poderosas manoplas hextec capazes de esmagar paredes e suspeitos com a mesma facilidade.', 'https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Vi_0.jpg'),
        ('Ekko', 'Assassino', 'Um prodígio das ruas violentas de Zaun, Ekko manipula o tempo para reverter qualquer situação a seu favor. Usando sua própria invenção, o Revo-Z, ele explora as possíveis bifurcações da realidade para criar o momento perfeito. Embora valorize muito sua liberdade, quando algo ameaça seus amigos, ele não mede esforços para defendê-los. Para meros observadores, Ekko parece conseguir o impossível sempre de primeira.', 'https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Ekko_0.jpg'),
        ('Caitlyn', 'Atirador', 'Conhecida como sua melhor pacificadora, Caitlyn também é a melhor escolha de Piltover para livrar a cidade de seus elementos criminosos elusivos. É comum que ela faça dupla com Vi, agindo como um contraponto de calmaria para a natureza impetuosa de sua parceira. Mesmo carregando um rifle hextec único, a arma mais poderosa de Caitlyn é seu intelecto superior, que permite que ela prepare elaboradas armadilhas para qualquer fora da lei tolo o suficiente para operar na Cidade do Progresso.', 'https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Caitlyn_0.jpg'),
        ('Jayce', 'Lutador', 'Jayce é um brilhante inventor que dedicou sua vida a defender Piltover e sua implacável busca pelo progresso. Com seu martelo hextech transformador em mãos, Jayce usa sua força, coragem e considerável inteligência para proteger sua cidade natal. Embora seja aclamado pela cidade como herói, ele não gosta muito da atenção que o heroísmo traz. Mesmo assim, o coração de Jayce está no lugar certo e até aqueles que invejam suas habilidades naturais são gratos à forma como ele protege a Cidade do Progresso.', 'https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Jayce_0.jpg'),
        ('Viktor', 'Mago', 'Viktor, o arauto de uma nova era de tecnologia, devotou sua vida ao avanço da humanidade. Um idealista que busca elevar o povo de Zaun a um novo nível de compreensão, ele acredita que somente ao aceitar a evolução gloriosa da tecnologia será possível que a humanidade alcance seu verdadeiro potencial. Com um corpo melhorado por aço e ciência, Viktor é zeloso na sua busca por este brilhante futuro.', 'https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Viktor_0.jpg'),
        ('Heimerdinger', 'Mago', 'Um cientista brilhante, mesmo que excêntrico, o Professor Cecil B. Heimerdinger é um dos inventores mais inovadores e estimados que Piltover já conheceu. Incansável em seu trabalho ao ponto da obsessão neurótica, ele busca responder as questões mais impenetráveis do universo. Apesar de suas teorias frequentemente parecerem obscuras e esotéricas, Heimerdinger produziu algumas das máquinas mais miraculosas, sem mencionar letais, de Piltover e ajusta constantemente suas invenções para torná-las ainda mais eficientes.', 'https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Heimerdinger_0.jpg'),
        ('Singed', 'Tanque', 'Singed é um alquimista zaunita de intelecto inigualável, que devotou sua vida a ultrapassar os limites do conhecimento; e nenhum preço, nem sua própria sanidade, é alto demais. Existe cura para sua loucura? Suas misturas raramente falham, mas, para muitos, Singed perdeu qualquer noção da humanidade, deixando uma trilha tóxica de miséria e terror no seu caminho.', 'https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Singed_0.jpg'),
        ('Ryze', 'Mago', 'Considerado pela grande maioria como o mago mais habilidoso de Runeterra, Ryze é um arquimago ancião e amargo que carrega um enorme peso. Dotado de um enorme poder arcano e de uma notável estrutura física, ele busca incansavelmente pelas Runas Globais, que são fragmentos de magia pura que um dia criaram o mundo a partir do nada. Ele deve recuperar esses artefatos antes que eles caiam em mãos erradas, pois Ryze conhece bem os horrores que eles podem infligir em Runeterra.', 'https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Ryze_0.jpg'),
        ('Master Yi', 'Assassino', 'Master Yi treinou seu corpo e afiou sua mente para que pensamento e ação se tornassem quase um só. Embora ele prefira recorrer à violência como último recurso, a leveza e a velocidade de sua espada garantem uma resolução sempre veloz. Como um dos últimos praticantes da arte ioniana do Wuju, Yi dedicou sua vida a preservar o legado de seu povo, avaliando potenciais discípulos com as Sete Lentes da Perspicácia para identificar qual deles era o mais digno.', 'https://ddragon.leagueoflegends.com/cdn/img/champion/splash/MasterYi_0.jpg'),
        ('Garen', 'Lutador', 'Um guerreiro nobre e orgulhoso, Garen faz parte da Vanguarda Destemida. Popular entre seus companheiros e respeitado o suficiente por seus inimigos, sua reputação é nada mais do que o esperado de um herdeiro da prestigiosa família Stemmaguarda, encarregada de defender Demacia e seus ideais. Vestido com uma armadura resistente à magia e empunhando uma poderosa espada, Garen está sempre pronto para confrontar magos e feiticeiros no campo de batalha, em um verdadeiro furacão de aço virtuoso.', 'https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Garen_0.jpg'),
        ('Teemo', 'Atirador', 'Indiferente até aos obstáculos mais perigosos e ameaçadores, Teemo vasculha o mundo com infinito entusiasmo e animação. Um yordle com uma inabalável moral que se orgulha de seguir o Código dos Escoteiros de Bandópolis, às vezes com tanta dedicação que não se toca das possíveis consequências de suas ações. Embora alguns duvidem da existência dos escoteiros, uma coisa é certa: nunca se deve duvidar das convicções de Teemo.', 'https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Teemo_0.jpg');

    ```

### 📂 **Estrutura de Pastas | Folder Structure | Estrutura de Carpetas**

👉 **PT-AO**

>> De acordo com o exposto na Arquitectura de Projecto, a estrutura de pastas deste projecto sugere uma _Clean Architecture_ simplificada, visando a uma clara separação das responsabilidades e promovendo a autonomia das camadas em um projecto **_Spring Boot_**. Esta abordagem estrutural não só facilita a manutenção e a evolução do código, mas também sustenta a integração e a colaboração eficaz entre as diferentes partes da aplicação. Abaixo, a demonstração detalhada da disposição das pastas que compõem a aplicação, cada uma desempenhando um papel específico dentro do ecossistema de _software_:

    - **adapters/:** inclui os adaptadores que facilitam a comunicação entre a aplicação e o mundo externo (sendo a única pasta que "conhece" o Spring);

    - **in/:** abriga os adaptadores de entrada, tais como controladores REST, que lidam com as requisições dos utilizadores finais;

    - **out/:** contém os adaptadores de saída, responsáveis pela interacção com bases de dados e APIs externas;

    - **application/:** hospeda os casos de uso da aplicação, encapsulando a lógica de negócios essencial;

    - **domain/:** representa o coração da aplicação, englobando entidades, excepções e interfaces (portas) que articulam as regras de negócio fundamentais;

    - **exception/:** define as excepções personalizadas pertinentes ao domínio;

    - **model/:** modela as entidades do domínio, reflectindo os conceitos centrais da aplicação;

    - **ports/:** estabelece as interfaces que delineam os contratos para os adaptadores e serviços externos;

    - **Application.java**: a classe principal que orquestra a configuração e a execução da aplicação.

**PT-AO** 👈

👉 **EN-US**

>> In accordance with what was explained in the Project Architecture, the folder structure of this project suggests a simplified Clean Architecture, aiming for a clear separation of responsibilities and promoting the autonomy of the layers in a **Spring Boot** project. This structural approach not only facilitates code maintenance and evolution, but also supports integration and effective collaboration between the different parts of the application. Below is a detailed demonstration of the layout of the folders that make up the application, each one playing a specific role within the software ecosystem:

    - **adapters/:** includes the adapters that facilitate communication between the application and the outside world (being the only folder that "knows" Spring);

    - **in/:** hosts the input adapters, such as REST controllers, which handle end-user requests;

    - **out/:** contains output adapters, responsible for interacting with databases and external APIs;

    - **application/:** hosts the application's use cases, encapsulating the essential business logic;

    - **domain/:** represents the core of the application, comprising entities, exceptions and interfaces (ports) that articulate the fundamental business rules;

    - **exception/:** defines the custom exceptions relevant to the domain;

    - **model/:** models domain entities, reflecting the core concepts of the application;

    - **ports/:** establishes the interfaces that outline the contracts for adapters and external services;

    - **Application.java**: the main class that orchestrates the configuration and execution of the application.

**EN-US** 👈

👉 **ES-ES**

>> De acuerdo con lo explicado en la Arquitectura del Proyecto, la estructura de carpetas de este proyecto sugiere una _Clean Architecture_ simplificada, buscando una clara separación de responsabilidades y promoviendo la autonomía de las capas en un proyecto **_Spring Boot_**. Este enfoque estructural no sólo facilita el mantenimiento y la evolución del código, sino que también respalda la integración y colaboración efectiva entre diferentes partes de la aplicación. se muestra una demostración detallada de la disposición de las carpetas que componen la aplicación, cada una de las cuales desempeña un papel específico dentro del ecosistema _software_:

    - **adapters/:** incluye los adaptadores que facilitan la comunicación entre la aplicación y el mundo exterior (siendo la única carpeta que "conoce" Spring);

    - **in/:** alberga los adaptadores de entrada, como los controladores REST, que manejan las solicitudes de los usuarios finales;

    - **out/:** contiene los adaptadores de salida, responsables de interactuar con bases de datos y API externas;

    - **application/:** alberga los casos de uso de la aplicación, encapsulando la lógica de negocio esencial;

    - **domain/:** representa el núcleo de la aplicación, compuesto por entidades, excepciones e interfaces (puertos) que articulan las reglas de negocio fundamentales;

    - **exception/:** define las excepciones personalizadas pertinentes para el dominio;

    - **model/:** modela las entidades del dominio, reflejando los conceptos centrales de la aplicación;

    - **ports/:** establece las interfaces que perfilan los contratos para adaptadores y servicios externos;

    - **Application.java**: la clase principal que organiza la configuración y ejecución de la aplicación.

**ES-ES** 👈

### 📝 **Plano de Desenvolvimento | Development Plan | Plan de Desarrollo**

👉 **PT-AO**

- configurar o ambiente inicial do projecto. Definir a linguagem, o gestor de pacotes ou dependências e as dependências a serem utilizadas e também as versões do Java e do **_Spring Boot_** e os dados do projecto. Para configurar o _Spring Boot_, pode ser utilizado o _website_ "***[Spring Initializr](https://start.spring.io/)***";

- Baixar o arquivo previamente configurado e exportado do _website_ "_[Spring Initializr](https://start.spring.io/)_";

- Abrir o projecto na IDE _[IntelliJ IDEA Community Edition](https://www.jetbrains.com/idea/download)_;

- Configurar a versão do [JDK](https://www.oracle.com/br/java/technologies/downloads/#java21) na IDE;

- Na pasta "***resources/***", configurar o ficheiro "**application.properties**" ou então também poderá criar um ficheiro "**application.yml**". A configuração a ser efectuada compreenderá as definições de inicialização da base de dados e das restantes dependências do projecto;

- Para a criação de tabelas na base de dados, deve-se criar uma classe "**.sql**", na pasta "***resources/***", para que a aplicação possa efectuar a renderização na base de dados em memória;

- Criar a conexão à base de dados e depois converter e expor os dados para serem pesquisados no ***frontend***;