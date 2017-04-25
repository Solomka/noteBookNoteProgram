package ua.training.notebook_note.utils;

/**
 * Basic interface for GoF Builder pattern realization
 * <p>
 * Class that wants to use this pattern for its instances creation should
 * implement this interface
 * 
 * @author Solomka
 *
 * @param <T>
 *            creating object type
 */
public interface IBuilder<T> {
	T build();
}
