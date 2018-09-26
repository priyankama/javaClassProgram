class Matrix{
	private int arr[][]=new int[10][10];
	public Matrix(){
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++)
				System.out.print("0 ");
		System.out.println();
		}
	}
	public Matrix(int l,int r){
		for(int i=0;i<l;i++){
			for(int j=0;j<r;j++)
				System.out.print("0 ");
		System.out.println();
		}
	}
	public Matrix(Matrix m){
		
		/*for(int i=0;i<m.length;i++){
			for(int j=0;j<m[i].length;j++)
				System.out.print("0 ");
		System.out.println();
		}*/
	}
}