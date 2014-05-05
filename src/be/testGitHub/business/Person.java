package be.testGitHub.business;

public class Person {
	/* instance members */
	private String name;
	private String lastName;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		StringBuilder output = new StringBuilder();
		output.append(this.getName());
		output.append(" - ");
		output.append(this.getLastName());
		return output.toString();
	}
}
