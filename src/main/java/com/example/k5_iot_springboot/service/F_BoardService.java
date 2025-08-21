package com.example.k5_iot_springboot.service;

import com.example.k5_iot_springboot.dto.ResponseDto;
import com.example.k5_iot_springboot.dto.f_board.request.BoardRequestDto;
import com.example.k5_iot_springboot.dto.f_board.response.BoardResponseDto;
import jakarta.validation.Valid;

import java.util.List;

public interface F_BoardService {
    ResponseDto<BoardResponseDto.DetailResponse> createBoard(BoardRequestDto.@Valid CreateRequest request);
    ResponseDto<List<BoardResponseDto.SummaryResponse>> getAllBoards();
    ResponseDto<BoardResponseDto.DetailResponse> updateBoard(Long boardId, BoardRequestDto.@Valid UpdateRequest request);
}
