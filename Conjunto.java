class Conjunto{
	
	public Object values[];
	
	public Conjunto(int tam){
		values = new Object[tam];
	}
	
	public boolean addValue(Object v){
		for(int i = 0; i < values.length; i++){
			if(values[i]==null){
				values[i] = v;
				return true;
			}
		}
		return false;
	}
		
	public boolean removeValue(Object v){
		for(int i = 0; i < values.length; i++){
			if(values[i]==v){
				values[i] = null;
				return true;
			}
		}
		return false;
	}
	
	public Conjunto concat(Conjunto a){
		Conjunto novo = new Conjunto(this.sizeT() + a.sizeT());
		
		for(int i = 0; i < values.length; i++){
			novo.addValue(values[i]);
		}

		for(int i = 0; i < a.values.length; i++){
			novo.addValue(a.values[i]);
		}
		
		return novo;
	}
	
	public Conjunto intersect (Conjunto a){
		Conjunto novo = new Conjunto(this.sizeT());
		
		for(int i = 0; i < this.values.length; i++){
			for(int x = 0; i < a.values.length; i++){
				if(this.values[i] == a.values[x]){
					novo.addValue(a.values[x]);
				}
			}
		}
		
		return novo;	
	}
	
	public int sizeT(){
		return this.values.length;
	}
	
	public boolean empty(){
		for(int i = 0; i < this.values.length; i++){
			if(this.values[i] != null)
				return false;
		}
		return true;
	}
	
	public boolean full(){
		for(int i = 0; i < this.values.length; i++){
			if(this.values[i] == null)
				return false;
		}
		return true;
	}
	
	public Conjunto copy(){
		Conjunto novo = new Conjunto(this.sizeT());
		
		for(int i = 0; i < this.values.length; i++){
			novo.values[i] = this.values[i];
		}
		
		return novo;
	}

}
