package com.example.its.domain.issue;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service // injection をするためにつけるアノテーション
@RequiredArgsConstructor // IssueRepository を初期化するためのコンストラクタを定義するマーカー
public class IssueService {
    // final 修飾子は ReadOnly のようなもの、再代入をさせないという意味
    private final IssueRepository issueRepository; // IssueRepository を注入
    public List<IssueEntity> findAll() {
        return issueRepository.findAll();
    }
}
