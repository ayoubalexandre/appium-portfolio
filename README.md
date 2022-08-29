# Projeto mobile Appium

Este é um projeto de automação de testes de uma calculadora

## Requisitos
 * IDE intelliJ
 * Java 8+ JDK deve estar instalado
 * Maven deve estar instalado e configurado no path da aplicação
 * Appium deve estar instalado


### Instalar a JDK versão 8

#### Em ambiente Windows:
 * Adicionar a variável de ambiente JAVA_HOME, apontando no Valor da variável, o caminho onde a JDK foi instalada
 * Adicionar o parâmetro "%JAVA_HOME%\bin;" no valor da variável de ambiente 'Path'
 * Para verificar se a configuração foi realizada com sucesso, basta abrir o prompt e digitar o comando "java -version"

### Instalar a IDE do intelliJ
 * Basta fazer o download e seguir com a instalação padrão

### Instalar o Android Studio
 * Basta fazer o download e seguir com a instalação padrão
#### Após a instalação:
 * Acessar o SDK Manager
 * Instalar as versões mais novas do Android na aba SDK Platforms
 * Instalar o Android Emulator, Android SDK Build Tools e Android SDK Platform-Tools, na aba SDK Tools
 * Adicionar a variável de ambiente ANDROID_HOME, apontando no valor da variável o caminho do "Android SDK Location"
 * Adicionar à variável Path os seguintes parâmetros: %ANDROID_HOME%\tools; %ANDROID_HOME%\tools\bin; %ANDROID_HOME%\platform-tools;
 * Para verificar se a configuração foi realizada com sucesso, basta abrir o prompt e digitar os seguintes comandos:
   * adb
   * emulator
   * uiautomatorviewer

### Instalar Emulador Android
 * Criar um novo projeto padrão no Android Studio
 * Acessar a opção AVD Manager e criar um emulador
 * Para executar o emulador via prompt, basta digitar o comando "emulator @<nome do emulador>"

### Instalar o Appium
 * Basta fazer o download da última release e fazer a instalação padrão

## Para executar os testes:
 * No caso de execução via emulador, é preciso iniciar um novo emulador conforme passos acima
 * No caso de execução em aparelho físico, basta conectar o aparelho, via cabo USB, ao computador
 * Inicializar o servidor do Appium mantendo as configurações de IP Host e Porta
 * No projeto, na classe AndroidDriverFactory, configurar as capacidades do device desejado
   * No parâmetro appium:app, apontar o caminho da apk na máquina
 * Executar a classe RunnerTest
