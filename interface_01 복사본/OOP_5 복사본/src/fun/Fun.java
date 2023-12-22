package fun;

public class Fun {

	//Field 
		public	int num1 = 0;
		public	int num2 = 0;
	
	
	//con   				생성자자는 if for  문을 사용할수없다 생성만할 뿐
				public Fun () {																		//
					//원래는 적여야하지만 이클립스에서대신 해주기 때문에 비워두는것
					
				}

         //this <<받아서 내클라스의 Field로 넘긴다  	Field로 넘겨야 Method에서 쓸수있다
				public  Fun(int num1, int num2) {													//      생성자가 중복임에도 에러가 안뜸 overloading
					//Method 도 뒤에 변수의 숫자만 다르면 중복가능하다 
					
					
					this.num1 = num1;
					this.num2 = num2;
					addAction();
					subAction();
					mulAction();
					divAction();
					
				}
	
				public void funAll() {
					String arr[] = {addAction(),subAction(),mulAction(),divAction()};					//배열로 실행 가능
					
					for (int i =0; i <arr.length; i++ ) {
						String a = arr[i];
					}
				}
				
				
				
	
	//Method
      public String addAction() {
    	  System.out.println("덧셈 :" +(num1+num2));
    	  return "";
      }
	
      public String subAction() {
   	  System.out.println("뺄셈 :" +(num1-num2));
   	  return"";
     }
      public String mulAction() {
       	  System.out.println("곱셈 :" +(num1*num2));
       	  return"";
         }
      public String divAction() {
       	  System.out.println("나눗셈 :" +(num1/num2));
       	  return "";
       	  
         }
}
