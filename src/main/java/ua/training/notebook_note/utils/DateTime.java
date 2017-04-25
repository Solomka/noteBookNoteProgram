package ua.training.notebook_note.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 * Class that represents LocalDateTime in specified format using
 * DateTimeFormatter
 * 
 * @author Solomka
 *
 */
public class DateTime {

	private LocalDateTime timePoint;
	private DateTimeFormatter formatter;

	/**
	 * Creates DateTime instance that represents current Date and Time and uses
	 * FormatStyle.SHORT for its representation
	 */
	public DateTime() {
		timePoint = LocalDateTime.now();
		formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
	}

	public DateTime(LocalDateTime localDateTime, DateTimeFormatter dateTimeFormatter) {
		timePoint = localDateTime;
		formatter = dateTimeFormatter;
	}

	public LocalDateTime getTimePoint() {
		return timePoint;
	}

	public void setTimePoint(LocalDateTime timePoint) {
		this.timePoint = timePoint;
	}

	public DateTimeFormatter getFormatter() {
		return formatter;
	}

	public void setFormatter(DateTimeFormatter formatter) {
		this.formatter = formatter;
	}

	public String toString() {
		return timePoint.format(formatter);
	}
}
