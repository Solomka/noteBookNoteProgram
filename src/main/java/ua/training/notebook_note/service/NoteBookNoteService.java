package ua.training.notebook_note.service;

import ua.training.notebook_note.model.dto.NoteBookNoteDTO;
import ua.training.notebook_note.model.entity.NoteBookNoteBO;

public interface NoteBookNoteService {

	public void addNoteBookNoteToModel(NoteBookNoteDTO noteDTO);

	public NoteBookNoteBO getModelNoteBookNote();

}
