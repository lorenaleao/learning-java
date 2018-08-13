interface thing_that_can_be_read {

	void reading_evolution (int currentPage);
	void updates_conservation_status (String currentState);
	void updates_location (String currentLocation); //Is the book/magazine/article/etc borrowed or is it in the library?
}