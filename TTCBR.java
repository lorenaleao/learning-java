class TTCBR implements thing_that_can_be_read {

	int total_number_pages, page;
	String state;
	String location;

	public void reading_evolution (int currentPage);
	public void updates_conservation_status (String currentState);
	void updates_location (String currentLocation); //Is the book/magazine/article/etc borrowed or is it in the library?	
}