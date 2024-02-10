package com.BookMyShow.book_my_show.ResponseDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MovieResponseDto{
    private String name;
    private int duration;

    private Date releaseDate;

	public void setName(Object movieName) {
		// TODO Auto-generated method stub
		
	}

	public void setDuration(Object duration2) {
		// TODO Auto-generated method stub
		
	}

	public void setReleaseDate(Object releaseDate2) {
		// TODO Auto-generated method stub
		
	}
}
