package ua.training.notebook_note.service;

import ua.training.notebook_note.controller.converter.NoteBookNoteBOConverter;
import ua.training.notebook_note.model.Model;
import ua.training.notebook_note.model.dto.NoteBookNoteDTO;
import ua.training.notebook_note.model.entity.NoteBookNoteBO;

public class NoteBookNoteService {
	
	private Model model;
	
	public NoteBookNoteService(Model model){
		this.model = model;		
	}
	
	public void addNoteBookNoteToModel(final NoteBookNoteDTO noteDTO) {
		
		final NoteBookNoteBO noteBookNoteBO = createNoteBookNoteBO(noteDTO);
		model.setNoteBooNoteBO(noteBookNoteBO);
	}	
	
	private NoteBookNoteBO createNoteBookNoteBO(final NoteBookNoteDTO noteDTO){				
		return NoteBookNoteBOConverter.fromNoteBookNoteDTO(noteDTO);		
	}
	
	public NoteBookNoteBO getNoteBooNote(){
		return model.getNoteBooNoteBO();
	}	

}
