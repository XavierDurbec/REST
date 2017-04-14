package fr.univtln.xdurbec066.testD21.note;

import fr.univtln.xdurbec066.testD21.item.Item;
import org.eclipse.persistence.jpa.config.Cascade;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by xdurbec066 on 23/03/17.
 */
@Entity
public class Note {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int id;

    @ManyToOne  (cascade = {CascadeType.PERSIST})
    private Item item;

    private String note;
    private String commentaire;

    public Note() {
    }

    public Note(String note , Item item) {
        this.note = note;
        this.item = item;
    }


    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public int getId() {
        return id;
    }


    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    @Override
    public String toString() {
        return "Note{" +
                "id=" + id +
                ", note='" + note + '\'' +
                ", commentaire='" + commentaire + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Note)) return false;

        Note note = (Note) o;

        return getId() == note.getId();

    }

    @Override
    public int hashCode() {
        return getId();
    }
}
