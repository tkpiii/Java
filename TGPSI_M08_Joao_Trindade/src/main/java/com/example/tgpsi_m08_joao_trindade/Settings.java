package com.example.tgpsi_m08_joao_trindade;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.stage.Stage;

public class Settings {
    private static Stage primaryStage;

    public static Stage getPrimaryStage() {
        return primaryStage;
    }

    public static void setPrimaryStage(Stage primaryStage) {
        Settings.primaryStage = primaryStage;
    }
    // Lista observável de produtos
    protected static ObservableList<produto> listaProduto = FXCollections.observableArrayList();
    // Método para obter a lista de produtos
    public static ObservableList<produto> getListaProduto() {
        return listaProduto;
    }
    // Lista observável de clientes
    protected static ObservableList<Cliente> listaCliente = FXCollections.observableArrayList();
    // Método para obter a lista de clientes
    public static ObservableList<Funcionario> getListaFuncionaro() {
        return listaFuncionario;
    }
    // Lista observável de funcionários
    protected static ObservableList<Funcionario> listaFuncionario = FXCollections.observableArrayList();
    // Método para obter a lista de funcionários
    public static ObservableList<Login> getListaContas() {
        return ListaContas;
    }
    // Lista observável de contas de login
    protected static ObservableList<Login> ListaContas = FXCollections.observableArrayList();
    // Método para obter a lista de clientes
    public static ObservableList<Cliente> getListaCliente() {
        return listaCliente;
    }
    // Variáveis estáticas para armazenar objetos editados
    private static produto ProdutoEdit;
    private static Cliente ClienteEdit;
    private static Funcionario funcionarioEdit;
    private static Login contaEdit;
    // Método para obter a conta de login editada
    public static Login getContaEdit() {
        return contaEdit;
    }
    // Método para definir a conta de login editada
    public static void setContaEdit(Login contaEdit) {
        Settings.contaEdit = contaEdit;}
    // Método para obter o cliente editado
    public static Cliente getClienteEdit() {
        return ClienteEdit;
    }
    // Método para definir o funcionário editado
    public static void setfuncionarioEdit(Funcionario funcionarioEdit) {
        Settings.funcionarioEdit = funcionarioEdit;}
    // Método para obter o funcionário editado
    public static Funcionario getFuncionarioEdit() {
        return funcionarioEdit;
    }
    // Método para definir o cliente editado
    public static void setClienteEdit(Cliente ClienteEdit) {
        Settings.ClienteEdit = ClienteEdit;
    }
    // Método para obter o produto editado
    public static produto getProdutoEdit() {
        return ProdutoEdit;
    }
    // Método para definir o produto editado
    public static void setProdutoEdit(produto ProdutoEdit) {
        Settings.ProdutoEdit = ProdutoEdit;
    }
    //Método para listar os produtos
    public static void ListaProduto(){
        listaProduto.add(new produto(1,"Banana","Fruta",42,0.32));
        listaProduto.add(new produto(2,"Maçã","Fruta",18,0.66));
        listaProduto.add(new produto(3,"Laranja","Fruta",63,0.45));
        listaProduto.add(new produto(4,"Kiwi","Fruta",25,0.41));
        listaProduto.add(new produto(5,"Limão","Fruta",47,0.48));
        listaProduto.add(new produto(6,"Manga","Fruta",47,2.40));
        listaProduto.add(new produto(7,"Pacote de Mirtilo","Fruta",47,6.50));
        listaProduto.add(new produto(8,"Lays Original","Fritos",20,2.00));

    }
    //Método para listar os Clientes
    public static void ListaCiente(){
        listaCliente.add(new Cliente(1,"Romário","Rua dos 123",915432789));
        listaCliente.add(new Cliente(2,"Corumba","Avenida dos Bichos",961234567));
        listaCliente.add(new Cliente(3,"Daniel","Rua dos Lindos",926789012));
        listaCliente.add(new Cliente(4,"Rafael","Avenida dos Chiguilingi",912345678));
        listaCliente.add(new Cliente(5,"Truta","Largo dos Bombeiros",967890123));

    }
    //Método para listar os Funcionarios
    public static void ListaFuncionario(){
        listaFuncionario.add(new Funcionario(100,"Dona Maria","Rua das Velhas","Dona "));
        listaFuncionario.add(new Funcionario(90,"Antonio","Avenida do Putin","Empregado"));
        listaFuncionario.add(new Funcionario(80,"Andre ","Rua dos Ciganos","Atendente do Balcão"));
        listaFuncionario.add(new Funcionario(70,"Isabela","Praça das Rosas","Atendente do Balcão"));
        listaFuncionario.add(new Funcionario(60,"Alexandra","Largo da Fonte","Ajudante"));

    }
    //Método para listar as Contas
    public static void ListaContas(){
        ListaContas.add(new Login("Joao","2005"));
        ListaContas.add(new Login("Maria","maria"));
    }
}
