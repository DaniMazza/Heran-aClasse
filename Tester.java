public class Tester {
        private static void templateEmployee(Empregado empregado) {
            String cargo = "Empregado(a)";
            if (empregado instanceof Vendedor) {
                cargo = "Vendedor(a)";
            } else if (empregado instanceof Operario) {
                cargo = "Operario(a)";
            } else if (empregado instanceof Administrador) {
                cargo = "Administrador(a)";
            }
            System.out.printf("|%-17s | %-13s | R$ %-6.0f |%n", cargo, empregado.getName(), empregado.getCalcularSalario());
        }

        private static void titleEmployee() {
            System.out.println("_________________");
            System.out.printf("|%-17s | %-13s | %-9s |%n", "Cargo", "Name", "Salario");
        }

        private static void titleSupplier() {
            System.out.println("_________________");
            System.out.printf("|%-17s | %-13s | %-9s |%n", "Cargo", "Name", "Saldo");
        }

        private static void templateSupplier(Fornecedor fornecedor) {
            System.out.printf("|%-17s | %-13s | R$ %-6.0f |%n", "Fornecedor(a)", fornecedor.getName(), fornecedor.obterSaldo());
        }
        private  static void finalLine() {
            System.out.println("|________________|");

        }

        public static void main(String[] args) {
            Fornecedor fornecedor1 = new Fornecedor("Gabriel", 300, 1000);
            titleSupplier();
            templateSupplier(fornecedor1.getName(), fornecedor1.obterSaldo());
            finalLine();
            Empregado empregado1 = new Empregado("Ziru", 171, 10000, 27.5);
            Empregado empregado2 = new Administrador("Antonio", 171, 10000, 27.5, 500);
            Empregado empregado3 = new Operario("Davi", 171, 10000, 27.5, 2000, 10);
            Empregado empregado4 = new Vendedor("Julia", 171, 10000, 27.5, 10000, 20);
            titleEmployee();
            templateEmployee(empregado1, empregado1.getName(), empregado1.calcularSalario());
            templateEmployee(empregado2, empregado2.getName(), empregado2.calcularSalario());
            templateEmployee(empregado3, empregado3.getName(), empregado3.calcularSalario());
            templateEmployee(empregado4, empregado4.getName(), empregado4.calcularSalario());
            finalLine();
        }
}
}

	}
}

