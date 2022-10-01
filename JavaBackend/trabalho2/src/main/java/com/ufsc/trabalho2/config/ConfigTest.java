package com.ufsc.trabalho2.config;

import java.util.Arrays;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.ufsc.trabalho2.entities.AssuntoEntity;
import com.ufsc.trabalho2.entities.ComentarioEntity;
import com.ufsc.trabalho2.entities.EditorEntity;
import com.ufsc.trabalho2.entities.PostagemEntity;
import com.ufsc.trabalho2.repositories.AssuntoRepository;
import com.ufsc.trabalho2.repositories.ComentarioRepository;
import com.ufsc.trabalho2.repositories.EditorRepository;
import com.ufsc.trabalho2.repositories.PostagemRepository;

@Configuration
@Profile("config")
public class ConfigTest implements CommandLineRunner {

    @Autowired
    AssuntoRepository assuntoRepository;

    @Autowired
    ComentarioRepository comentarioRepository;

    @Autowired
    EditorRepository editorRepository;

    @Autowired
    PostagemRepository postagemRepository;

    @Override
    public void run(String... args) throws Exception {
        Date dateExample = new Date(122, 9, 26);

        AssuntoEntity assunto1 = new AssuntoEntity("Descrição 1");
        AssuntoEntity assunto2 = new AssuntoEntity("Descrição 2");
        AssuntoEntity assunto3 = new AssuntoEntity("Descrição 3");

        assuntoRepository.saveAll(Arrays.asList(assunto1, assunto2, assunto3));

        EditorEntity editor1 = new EditorEntity("Nome 1", "Senha 1");
        EditorEntity editor2 = new EditorEntity("Nome 2", "Senha 2");
        EditorEntity editor3 = new EditorEntity("Nome 3", "Senha 3");

        editorRepository.saveAll(Arrays.asList(editor1, editor2, editor3));

        PostagemEntity postagem1 = new PostagemEntity("Postagem 1");
        PostagemEntity postagem2 = new PostagemEntity("Postagem 2");
        PostagemEntity postagem3 = new PostagemEntity("Postagem 3");

        postagem1.setEditor(editor1);
        postagem2.setEditor(editor1);
        postagem3.setEditor(editor2);

        postagemRepository.saveAll(Arrays.asList(postagem1, postagem2, postagem3));

        ComentarioEntity comentario1 = new ComentarioEntity("Comentario 1", dateExample, "Text 1");
        ComentarioEntity comentario2 = new ComentarioEntity("Comentario 2", dateExample, "Text 2");
        ComentarioEntity comentario3 = new ComentarioEntity("Comentario 3", dateExample, "Text 3");

        comentario1.setPostagem(postagem1);
        comentario2.setPostagem(postagem2);
        comentario3.setPostagem(postagem2);

        comentarioRepository.saveAll(Arrays.asList(comentario1, comentario2, comentario3));

        postagem1.getAssuntos().add(assunto1);
        postagem1.getAssuntos().add(assunto2);
        postagem1.getAssuntos().add(assunto3);
        postagem2.getAssuntos().add(assunto1);
        postagem3.getAssuntos().add(assunto1);

        postagemRepository.saveAll(Arrays.asList(postagem1, postagem2, postagem3));
    }

}
