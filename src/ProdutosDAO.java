/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Adm
 */

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.List;

public class ProdutosDAO {
    Connection conn;
    PreparedStatement prep;
    ResultSet resultset;
    static ArrayList<ProdutosDTO> listaProdutos = new ArrayList<>(Arrays.asList(
            new ProdutosDTO("Produto A", 50, "A Venda"),
            new ProdutosDTO("Produto B", 30, "A Venda"),
            new ProdutosDTO("Produto C", 25, "Vendido"),
            new ProdutosDTO("Produto D", 70, "A Venda")
        ));
    
    public void cadastrarProduto (ProdutosDTO produto){
        //conn = new conectaDAO().connectDB();
        ProdutosDAO.listaProdutos.add(produto);
        System.out.println("Produto cadastrado com sucesso");
    }
    
    public ArrayList<ProdutosDTO> listarProdutos(){
        return ProdutosDAO.listaProdutos;
    }
    
    public ArrayList<ProdutosDTO> listarProdutosVendidos(){
        return new ArrayList<>(listaProdutos.stream()
                .filter(produto -> produto.getStatus().equals("Vendido"))
                .collect(Collectors.toList()));
    }
}

