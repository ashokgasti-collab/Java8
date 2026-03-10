package multithd;

public class mutithd {
	static Object lock=new Object();
	static boolean flag=true;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Singleton.method());
		Thread oddt = new Thread(new odd());
		Thread event= new Thread(new even());
		
		oddt.start();
		event.start();
		
	}
	
	static class odd implements Runnable{

		@Override
		public void run() {
			// TODO Auto-generated method stub
			for(int i=0;i<10;i++) {
				synchronized (lock) {
					while(!flag) {
						try {
							lock.wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					if(i%2!=0)
						System.out.println("odd"+i);
					flag=false;
					lock.notify();
					
				}
				
			}
			
		}
		
	}
	static class even implements Runnable{

		@Override
		public void run() {
			// TODO Auto-generated method stub
			for(int i=0;i<10;i++) {
				synchronized (lock) {
					while(flag) {
						try {
							lock.wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					if(i%2==0)
						System.out.println("even"+i);
					flag=true;
					lock.notify();
					
				}
				
			}
			
		}
		
	}

}
