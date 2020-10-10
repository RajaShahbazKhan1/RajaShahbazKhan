package com.abstractions;

	public class FinalResult implements CompanyIdea1,CompanyIdea2,CompanyIdea3{

		public void getEngine() {
			System.out.println("AUDI");
		}

		public void getTires() {
			// TODO Auto-generated method stub
			System.out.println("CONTINENTAL");
		}

		public void getBody() {
			// TODO Auto-generated method stub
			System.out.println("G83");
		}

		public void getWatch() {
			// TODO Auto-generated method stub
			System.out.println("MK");
		}

		public void getBracelet() {
			// TODO Auto-generated method stub
			System.out.println("GUCII");
		}

		public void getRings() {
			// TODO Auto-generated method stub
			System.out.println("DIAMOND PRO");
		}

		public void getEmployess() {
			// TODO Auto-generated method stub
			System.out.println("RAJA KHAN");
		}

		public void getAdress() {
			// TODO Auto-generated method stub
			System.out.println("130 HAGAMAN STREET");
		}

		public void getID() {
			// TODO Auto-generated method stub
			System.out.println("103019"); }
			
	    public void getcar() {
				System.out.println("RANGE ROVER");
			}
	   public static void main(String[] args) {
		   FinalResult obj = new FinalResult();
		   obj.getEmployess();
		   obj.getID();
		   obj.getAdress();
		   obj.getcar();
		   obj.getEngine();
		   obj.getBracelet();
		   
	}
	}
			