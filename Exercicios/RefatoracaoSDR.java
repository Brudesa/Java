public class RefatoracaoSDR {
    private String username;
    private String password;

    public RefatoracaoSDR(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void registerUser() {
        // Validando nome usuário e senha
        if (validateUsername(username) && validatePassword(password)) {
            // Cadastrar usuário no banco de dados
            System.out.println("User registered successfully.");
        } else {
            System.out.println("Invalid username or password.");
        }
    }

    public void loginUser() {
        // Validar nome de usuário e senha
        if (validateUsername(username) && validatePassword(password)) {
            // Autenticar usuário
            System.out.println("User logged in successfully.");
        } else {
            System.out.println("Invalid username or password.");
        }
    }

    private boolean validateUsername(String username) {
        // Validate username (e.g., length, characters allowed)
        return username.length() >= 3;
    }

    private boolean validatePassword(String password) {
        // Validate password (mínimo 8 caracteres, uma letra e um número)
        return password.length() >= 8 && password.matches("^(?=.*[a-zA-Z])(?=.*\\d).+$");
    }

    public static void main(String[] args) {
        RefatoracaoSDR userManager = new RefatoracaoSDR("john_doe", "Password123");
        userManager.registerUser();
        userManager.loginUser();
    }
}
