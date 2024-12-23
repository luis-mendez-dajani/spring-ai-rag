package guru.springframework.springairag.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import guru.springframework.springairag.model.Answer;
import guru.springframework.springairag.model.Question;
import guru.springframework.springairag.services.OpenAIService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class QuestionController {

    private final OpenAIService openAIService;

    @PostMapping("/ask")
    public Answer askQuestion(@RequestBody Question question) {
        return openAIService.getAnswer(question);
    }

}