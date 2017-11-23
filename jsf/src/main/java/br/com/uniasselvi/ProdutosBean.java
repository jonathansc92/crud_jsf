package br.com.uniasselvi;

import java.util.List;
import java.util.ArrayList;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.dao.DaoGeneric;
import br.com.entidades.Produtos;

@ViewScoped
@ManagedBean(name = "produtosBean")
public class ProdutosBean {

	private Produtos produtos = new Produtos();
	private DaoGeneric<Produtos> daoGeneric = new DaoGeneric<Produtos>();
	private List<Produtos> produtosLst = new ArrayList<Produtos>();

	public String save() {
		produtos = daoGeneric.merge(produtos);
		loadProdutos();
		return "";
	}
	
	public String add(){
		produtos = new Produtos();
		return "";
	}
	
	public String del(){
		daoGeneric.deleteById(produtos);
		produtos = new Produtos();
		loadProdutos();
		return "";
	}
	
	@PostConstruct
	public void loadProdutos(){
		produtosLst = daoGeneric.getListEntity(Produtos.class);
	}

	public Produtos getProdutos() {
		return produtos;
	}

	public void setProdutos(Produtos produtos) {
		this.produtos = produtos;
	}

	public DaoGeneric<Produtos> getDaoGeneric() {
		return daoGeneric;
	}

	public void setDaoGeneric(DaoGeneric<Produtos> daoGeneric) {
		this.daoGeneric = daoGeneric;
	}
	
	public List<Produtos> getProdutosLst(){
		return produtosLst;
	}

}
