import React, { useEffect, useState } from "react";
import { getOne } from "../../api/todoApi";

const initState = {
  tno: 0,
  title: "",
  writer: "",
  dueDate: "",
  complete: false,
};

function ReadComponent({ tno }) {
  const [todo, setTodo] = useState(initState);

  useEffect(() => {
    getOne(tno).then((data) => {
      console.log(data);
      setTodo(data);
    });
  }, [tno]);

  return (
    <div className="border-2 border-sky-200 mt-10 m-2 p-4">
      {makeDiv("Tno", todo.tno)}
      {makeDiv("Writer", todo.writer)}
      {makeDiv("Title", todo.title)}
      {makeDiv("Due Date", todo.dueDate)}
      {makeDiv("Complete", todo.complete ? "Completed" : "Not Yet ")}
    </div>
  );
}

const makeDiv = (title, value) => (
  <div className="flex justify-center">
    <div className="relative mb-4 flex w-full flex-wrap items-stretch">
      <div className="w-1/5 p-6 text-right font-bold">{title}</div>
      <div className="w-4/5 p-6 rounded-r border-solid shadow-md">{value}</div>
    </div>
  </div>
);

export default ReadComponent;
