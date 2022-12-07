package by.lab3.client.controller;

import by.lab3.beans.*;

public interface ClientController {
	Request createRequest();
	void processResponse(Response response);
}
