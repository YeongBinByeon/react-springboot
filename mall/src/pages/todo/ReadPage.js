import React from "react";
import { useParams } from "react-router-dom";

function ReadPage(props) {
  const { tno } = useParams();

  console.log(tno);

  return <div className={"text-3xl"}>Todo Read Page</div>;
}

export default ReadPage;
