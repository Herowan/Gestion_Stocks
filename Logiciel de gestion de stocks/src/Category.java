import java.util.LinkedList;
import java.util.List;


public class Category {
	String name;
	List<Category> children;
	
	public Category(String n){
		this.name = n;
		children = new LinkedList<Category>();
	}
	
	public void addChild(Category c){
		children.add(c); 
	}
	
	public void removeChild(Category cat){
		if(children.contains(cat)){
			children.remove(cat);
		}
	}
	
	public Category getParentCategory(Category cat){
		//cat est la cat�gorie dont le parent est recherch�
		Category result;
		for(Category c:getChildren()){
			if(c == cat){
				return this;  //Si cat est enfant direct on retourne cat
			}
			else{           //Sinon on cherche dans cet enfant
				result = c.getParentCategory(cat);  //On cherche cat dans c
				if (result != null){  //La m�thode renvoie null seulement si la cat�gorie n'a pas �t� trouv�e.
					return result;
				}
			}
		}
		return null;  //On renvoie null si la cat�gorie cat n'a pas �t� trouv�e dans l'arbre d�fini par cat2
	}
	
	public boolean checkCategoryStructure(){
		if(children.size() == 0){
			if(this instanceof Product){
				return true;
			}
			else{
				return false;
			}
		}
		else{
			if(this instanceof Product){
				return false;
			}
			else{
				for(Category cat:getChildren()){
					if(!cat.checkCategoryStructure()){
						return false;
					}
				}
			}
		}
		return true;
	}
	
	public List<Category> getChildren(){
		return this.children;
	}

	public void setName(String n){
		this.name = n;
	}
	
	public String getName(){
		return this.name;
	}
	
	public String toString(){
		return this.name;
	}
	
}
