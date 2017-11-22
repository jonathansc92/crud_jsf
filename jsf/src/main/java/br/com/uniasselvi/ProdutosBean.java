package br.com.uniasselvi;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.dao.DaoGeneric;
import br.com.entidades.Produtos;

@ViewScoped
@ManagedBean(name = "produtosBean")
public class ProdutosBean {

	private Produtos produtos = new Produtos();
	private DaoGeneric<Produtos> daoGeneric = new DaoGeneric<Produtos>();

	public String save() {
		daoGeneric.save(produtos);
		
		return "";
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

}
