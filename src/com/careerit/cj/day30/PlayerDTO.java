package com.careerit.cj.day30;

public class PlayerDTO {

		private String name;
		private String role;
		
		
		public PlayerDTO() {
			super();
			// TODO Auto-generated constructor stub
		}


		public PlayerDTO(String name, String role) {
			super();
			this.name = name;
			this.role = role;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public String getRole() {
			return role;
		}


		public void setRole(String role) {
			this.role = role;
		}


		@Override
		public String toString() {
			return String.format("PlayerDTO [name=%s, role=%s]", name, role);
		}
		
		
}
