void main() {
    // Introducción
    Scanner sc = new Scanner(System.in);
    String input_usuario = "";
    String input_contrasenia = "";
    String nivel_usuario;
    // Desarrollo
    System.out.println("Introduce tu nivel de usuario: ");
    nivel_usuario = sc.nextLine();
    System.out.println("Intruduce tu nombre de usuario: ");
    input_usuario = sc.nextLine();
    System.out.println("Introduce tu contraseña: ");
    input_contrasenia = sc.nextLine();
    // Desenlace

    // == Nivel 1 ==
    if (nivel_usuario.equals("1") && input_usuario.equals("admin") && input_contrasenia.equals("1234")) {
        System.out.println("¡Verificación completa, accediendo como administrador!");
    } else if (nivel_usuario.equals("2") && input_usuario.equals("user") && input_contrasenia.equals("abcd")) {
        System.out.println("¡Verificación completa, accediendo como user!");
    } else if (nivel_usuario.equals("3") && input_usuario.equals("guest") && input_contrasenia.equals("xyz")) {
        System.out.println("¡Verificación completa, accediendo como guest!");
    } else {
        System.out.println("Acceso denegado.");
    };

}

