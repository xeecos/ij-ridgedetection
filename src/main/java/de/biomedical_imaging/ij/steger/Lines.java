/*  detect-lines, extract lines and their width from images.
    Copyright (C) 1996-1998 Carsten Steger

    This program is free software; you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation; either version 2, or (at your option)
    any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program; if not, write to the Free Software
    Foundation, Inc., 675 Mass Ave, Cambridge, MA 02139, USA. */

/* 	Changes Made by R. Balasubramanian for incorporating the the detect lines code to incorporate
   	within GRASP (May 10th 1999) */

/*	Translated into an ImageJ java plugin by Thorsten Wagner (Dez. 2014) */

package de.biomedical_imaging.ij.steger;

import java.util.ArrayList;

public class Lines extends ArrayList<Line> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int frame;
	
	/**
	 * 
	 * @param frame Slice number
	 */
	public Lines(int frame) {
		// TODO Auto-generated constructor stub
		this.frame = frame;
	}
	
	public int getFrame(){
		return frame;
	}
	
	public int getIndexByID(int id){
		for(int i = 0; i < this.size(); i++){
			if(this.get(i).getID()==id){
				return i;
			}
		}
		return -1;
	}


}
