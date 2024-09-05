package edu.ict.prj.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface ShoppingCommand {

	public abstract void execute(HttpServletRequest request, HttpServletResponse response);

}